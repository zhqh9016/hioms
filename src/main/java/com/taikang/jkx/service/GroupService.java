package com.taikang.jkx.service;

import java.util.List;

import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsGroup;



public interface GroupService {

	public List<HiomsGroup> listGroup(String parentId);
	
	public AjaxResponse addGroup(HiomsGroup group);
	
	public HiomsGroup getGroupByGroupId(String groupId);
	
	public List<String> getLeafsByGroupId(String groupId);

	public AjaxResponse deleteGroup(String groupId);

}
