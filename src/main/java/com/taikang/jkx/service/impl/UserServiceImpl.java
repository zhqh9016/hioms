package com.taikang.jkx.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.exception.TKCheckedException;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.HiomsGroupMapper;
import com.taikang.jkx.mapper.HiomsUserMapper;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.HiomsUserExample;
import com.taikang.jkx.model.HiomsUserExample.Criteria;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.UserService;
import com.taikang.jkx.tools.UUIDUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private HiomsUserMapper hiomsUserMapper;
	@Autowired
	private HiomsGroupMapper groupMapper;

	/**
	 * 根据登录名、所属组织、姓名、是否有效筛选数据
	 */
	@Override
	public Page<HiomsUser> listUser(HiomsUser user, int page, int rows) {

		Page<HiomsUser> result = new Page<>();

		HiomsUserExample example = new HiomsUserExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(user.getGroupId())) {
			criteria.andGroupIdEqualTo(user.getGroupId());
		}
		if (!StringUtils.isEmpty(user.getLoginName())) {
			criteria.andLoginNameLike("%" + user.getLoginName() + "%");
		}
		if (!StringUtils.isEmpty(user.getUserName())) {
			criteria.andUserNameLike("%" + user.getUserName() + "%");
		}
		if(user.getValid()!=null){
			criteria.andValidEqualTo(user.getValid());
		}
		example.setOffset((page - 1) * rows);
		example.setLimit(rows);

		List<HiomsUser> selectByExample = hiomsUserMapper.selectByExample(example);
		long countByExample = hiomsUserMapper.countByExample(example);

		result.setTotal(countByExample);
		result.getRows().addAll(selectByExample);

		return result;
	}

	/**
	 * 根据表单提交的数据添加用户
	 * @throws TKCheckedException
	 */
	@Override
	public int addUser(HiomsUser user) throws TKCheckedException {
		//生成用户唯一标识
		String userId = UUIDUtil.generateUUID();
		user.setUserId(userId);
		//根据组织编码查询出组织名称
		String groupId = user.getGroupId();
		if(!StringUtils.isEmpty(groupId)){
			HiomsGroup selectByPrimaryKey = groupMapper.selectByPrimaryKey(user.getGroupId());
			if(selectByPrimaryKey!=null){
				user.setGroupName(selectByPrimaryKey.getGroupName());
			}
		}
		user.setPassWord(UserUtils.entryptPassword(Constant.USER_DEFAULT));
		user.setCreator(UserUtils.getCurrentUser().getLoginName());
		user.setCreateTime(new Date(System.currentTimeMillis()));
		user.setValid(Constant.HIOMS_VALID_YES);
		int insert = hiomsUserMapper.insert(user);
		return insert;
	}

	/**
	 * 根据用户ID删除用户
	 */
	@Override
	public int deleteUserById(String userId) {
		HiomsUser selectByPrimaryKey = hiomsUserMapper.selectByPrimaryKey(userId);
		selectByPrimaryKey.setValid(Constant.HIOMS_VALID_NO);
		int updateByPrimaryKey = 0;
		if(selectByPrimaryKey!=null && !StringUtils.isEmpty(selectByPrimaryKey.getUserId())){
			updateByPrimaryKey = hiomsUserMapper.updateByPrimaryKey(selectByPrimaryKey);
		}
		return updateByPrimaryKey;
	}

	@Override
	public List<HiomsUser> findUserByLoginname(String loginName) {
		HiomsUserExample example = new HiomsUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andLoginNameEqualTo(loginName);
		criteria.andValidEqualTo(Constant.HIOMS_VALID_YES);
		List<HiomsUser> users = hiomsUserMapper.selectByExample(example );
		return users;
	}

	@Override
	public AjaxResponse changePassword(String old_password, String new_password, String repeat_new_password) throws TKCheckedException {
		AjaxResponse result = new AjaxResponse();
		//====校验表单有效性开始===
		if(StringUtils.isEmpty(old_password)||StringUtils.isEmpty(new_password)||StringUtils.isEmpty(repeat_new_password)){
			result.setState(false);
			result.setMessage("各表单项不能为空");
			return result;
		}
		
		if(!new_password.equals(repeat_new_password)){
			result.setState(false);
			result.setMessage("两次输入的新密码不一致,修改密码失败");
			return result;
		}
		HiomsUser currentUser = UserUtils.getCurrentUser();
		String userId = currentUser.getUserId();
		HiomsUser selectUser = hiomsUserMapper.selectByPrimaryKey(userId);
		String passWord = selectUser.getPassWord();
		boolean validatePassword = UserUtils.validatePassword(old_password, passWord);
		if(!validatePassword){
			result.setState(false);
			result.setMessage("输入的旧密码有误,请重新输入");
			return result;
		}
		//====校验表单有效性结束=====
		
		String entryptPassword = UserUtils.entryptPassword(new_password);
		selectUser.setPassWord(entryptPassword);
		int updateByPrimaryKey = hiomsUserMapper.updateByPrimaryKey(selectUser);
		if(updateByPrimaryKey == 1){
			result.setState(true);
			result.setMessage("修改密码成功");
		}else{
			result.setState(false);
			result.setMessage("发生未知错误,请确认密码是否修改成功");
		}
		
		return result;
	}

}
