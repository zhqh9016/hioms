package com.taikang.jkx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.exception.TKCheckedException;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.UserService;

@RestController
@RequestMapping("user")
public class HiomsUserController {

	@Autowired
	private UserService userService;

	/**
	 * 根据筛选条件查询用户信息
	 * 
	 * @param user
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path = "listUser", method = RequestMethod.POST)
	public GridEntity<HiomsUser> listUser(HiomsUser user, int page, int rows) {
		GridEntity<HiomsUser> result = new GridEntity<>();
		// 默认查询当前有效的用户
		if (user.getValid() == null) {
			user.setValid(Constant.HIOMS_VALID_YES);
		}
		Page<HiomsUser> users = userService.listUser(user, page, rows);

		result.setTotal(users.getTotal());
		result.getRows().addAll(users.getRows());
		return result;
	}

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 * @throws TKCheckedException
	 */
	@RequestMapping(path = "addUser", method = RequestMethod.POST)
	public AjaxResponse addUser(HiomsUser user) throws TKCheckedException {
		AjaxResponse result = new AjaxResponse();
		// 先查询要添加的用户登录名是否已存在
		HiomsUser user_param = new HiomsUser();
		user_param.setValid(1);
		user_param.setLoginName(user.getLoginName());
		Page<HiomsUser> currentUserList = userService.listUser(user_param, 1, 10);
		if (currentUserList.getTotal() != 0) {
			result.setState(false);
			result.setMessage("当前登录名已存在,请使用其他登录名");
			return result;
		}
		int i = userService.addUser(user);
		result.setState(true);
		result.setMessage("成功添加" + i + "条记录!");
		return result;
	}

	/**
	 * 根据用户ID删除用户信息,逻辑删除
	 * 
	 * @param userId
	 * @return
	 */
	@RequestMapping(path = "deleteUser", method = RequestMethod.POST)
	public AjaxResponse deleteUser(String ids) {
		AjaxResponse result = new AjaxResponse();
		String[] split = ids.split(",");
		int i = 0;
		for (String string : split) {
			if (!StringUtils.isEmpty(string)) {
				int deleteUserById = userService.deleteUserById(string);
				i += deleteUserById;
			}
		}
		result.setState(true);
		result.setMessage("共删除" + i + "条记录");
		return result;
	}
	
	@RequestMapping(path = "changePassword" ,method = RequestMethod.POST)
	public AjaxResponse changePassword(String old_password,String new_password,String repeat_new_password) throws TKCheckedException{
		AjaxResponse result = new AjaxResponse();
		result = userService.changePassword(old_password,new_password,repeat_new_password);
		
		return result;
	}

	/**
	 * 获取当前登录用户的信息
	 * @return
	 */
	@RequestMapping(path = "currentUser", method = RequestMethod.POST)
	public AjaxResponse currentUser() {
		AjaxResponse result = new AjaxResponse();
		HiomsUser currentUser = UserUtils.getCurrentUser();
		if (currentUser != null && !StringUtils.isEmpty(currentUser.getUserName())) {
			result.setState(true);
			result.setMessage(currentUser.getUserName());
		} else {
			result.setState(false);
			result.setMessage("请先登录系统");
		}
		return result;
	}
}
