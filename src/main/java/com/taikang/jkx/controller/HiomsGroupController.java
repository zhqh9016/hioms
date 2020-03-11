package com.taikang.jkx.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.service.GroupService;

@RestController
@RequestMapping("group")
public class HiomsGroupController {
	
	@Autowired
	private GroupService groupService;
	
	/**
	 * 根据条件查询组织
	 * @param groupName
	 * @param parentId
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path="listGroup",method = RequestMethod.POST)
	public GridEntity<HiomsGroup> listGroup(String groupName,String parentId){
		GridEntity<HiomsGroup> result = new GridEntity<>();
		
		List<HiomsGroup> groups = groupService.listGroup(parentId);
		if(CollectionUtils.isEmpty(groups)){
			result.setTotal(0);
		}
		else{
			result.setTotal(groups.size());
		}
		result.getRows().addAll(groups);
		return result;
	}
	
	/**
	 * 为下拉框提供组织列表
	 * @return
	 */
	@RequestMapping(path="listGroup4ComboTree",method=RequestMethod.POST)
	public List<HiomsGroup> listGroup4ComboTree(){
		List<HiomsGroup> groups = groupService.listGroup("0");
		return groups;
	}
	
	/**
	 * 为统筹区下拉框提供列表
	 * @return
	 */
	@RequestMapping(path="listAreas4ComboTree",method=RequestMethod.POST)
	public List<HiomsGroup> listAreas4ConboTree(){
		
		HiomsUser currentUser = UserUtils.getCurrentUser();
		String groupId = currentUser.getGroupId();
		List<HiomsGroup> groups = groupService.listGroup(groupId);
		return groups;
	}
	
	/**
	 * 添加组织
	 * @param group
	 * @return
	 */
	@RequestMapping(path="addGroup" ,method=RequestMethod.POST)
	public AjaxResponse addGroup(HiomsGroup group){
		AjaxResponse addGroup = groupService.addGroup(group);
		return addGroup;
	}
	
	/**
	 * 删除组织
	 * @param groupId
	 * @return
	 */
	@RequestMapping(path="deleteGroup",method=RequestMethod.POST)
	public AjaxResponse deleteGroup(String groupId){
		
		AjaxResponse result = new AjaxResponse();
		//先对groupId做检验
		if(StringUtils.isEmpty(groupId)){
			result.setState(false);
			result.setMessage("必须指定要删除的组织机构");
			return result;
		}
		
		HiomsGroup groupByGroupId = groupService.getGroupByGroupId(groupId);
		if(groupByGroupId==null){
			result.setState(false);
			result.setMessage("您要删除的组织不在系统中，请检查");
			return result;
		}
		
		result = groupService.deleteGroup(groupId);
		
		return result;
	}

}
