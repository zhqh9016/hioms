package com.taikang.jkx.service;


import java.util.List;

import com.taikang.jkx.common.exception.TKCheckedException;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.Page;

public interface UserService {

	public Page<HiomsUser> listUser(HiomsUser user, int page, int rows);

	public int addUser(HiomsUser user) throws TKCheckedException;

	public int deleteUserById(String userId);
	
	public List<HiomsUser> findUserByLoginname(String loginName);

	public AjaxResponse changePassword(String old_password, String new_password, String repeat_new_password) throws TKCheckedException;

}
