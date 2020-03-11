package com.taikang.jkx.common.shiro;


import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.taikang.jkx.common.util.Encodes;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.model.HiomsRUserPositionKey;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.service.RUserPositionService;
import com.taikang.jkx.service.UserService;


/**
 * 系统安全认证实现类 自定义shiro Realm,主要做两个工作, 1:根据用户名从数据库中查询用户信息,然后封装到AuthenticationInfo中返回给SecurityManager.
 * 2:根据用户信息从数据库中查找用户的角色权限信息,然后封装到AuthorizationInfo中返回给SecurityManager.
 *
 * @author zhangqh27
 */
public class SystemAuthorizingRealm extends AuthorizingRealm implements Serializable {

  /** */
  private static final long serialVersionUID = 1L;

  

  @Autowired 
  private UserService userService;
  @Autowired
  private RUserPositionService userPositionService;
  //@Autowired private RoleService roleService;
  //@Autowired private IOrganizationService organizationService;
  //@Autowired private MenuService menuService;

  /** 认证回调函数, 登录时调用 */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
      throws AuthenticationException {
    //从token中获取用户名
    UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
    String loginName = (String) token.getPrincipal();
    //根据用户名获取用户信息
    List<HiomsUser> findUserByLoginname = userService.findUserByLoginname(loginName);
    //如果没有匹配到用户,直接抛出用户名不存在的异常
    if (CollectionUtils.isEmpty(findUserByLoginname)) {
      throw new UnknownAccountException();
    }
    HiomsUser hiomsUser = findUserByLoginname.get(0);
    //================将用户的角色信息、组织信息、菜单信息存入用户凭证中==================
    //=================================================================================

    // 将用户可访问菜单存入subject中
//    ResultDTO menuDto = menuService.listMenu(userDTO.getId(), IsMenuEnum.IS_MENU_YES.getValue());
//    List<MenuDTO> menuList = (List<MenuDTO>) menuDto.getDatas();
//    log.debug("将用户菜单信息存入用户凭证中,菜单信息为: " + menuList);
//    userDTO.setMenu(menuList);
    
    // 将用户所拥有角色信息存入subject中
    

    //================================================================================
    //================================================================================

    //从查出的用户中获取密码信息,并将用户随机盐从密码中分离出来
    String userpassword = hiomsUser.getPassWord();

    String password = userpassword.substring(16);
    String salt = userpassword.substring(0, 16);
    //构建用户认证凭证,并设置用户信息和密码,随机盐
    SimpleAuthenticationInfo simpleAuthenticationInfo =
        new SimpleAuthenticationInfo(
        		hiomsUser, password, ByteSource.Util.bytes(Encodes.decodeHex(salt)), getName());

    return simpleAuthenticationInfo;
  }

  /** 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用 */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    //获取当前登录用户的id
    HiomsUser currentUser = UserUtils.getCurrentUser();
    String id = currentUser.getUserId();
    //根据id查出所有用户角色信息
    List<HiomsRUserPositionKey> positions = userPositionService.getPositionsByUserId(id);
    //将用户角色信息存入authorizationInfo中
    Set<String> roles = new HashSet<>();
    for (HiomsRUserPositionKey source : positions) {
      roles.add(source.getPositionId());
    }
    SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
    authorizationInfo.setRoles(roles);
    return authorizationInfo;
  }
}
