package com.taikang.jkx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.HiomsProject;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.ProjectService;

@RestController
@RequestMapping("project")
public class HiomsProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	
	/**
	 * 添加项目
	 * @param hiomsProject
	 * @return
	 */
	@RequestMapping(path="addproject",method=RequestMethod.POST)
	public AjaxResponse addProject(HiomsProject hiomsProject){
		
		AjaxResponse result = new AjaxResponse();
		
		projectService.saveProject(hiomsProject);
		
		result.setState(true);
		result.setMessage("机构保存成功");
		
		return result;
	}
	
	/**
	 * 展示项目列表
	 * @param project
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path="listproject" ,method = RequestMethod.POST)
	public GridEntity<HiomsProject> listProject(HiomsProject project,int page, int rows){
		
		GridEntity<HiomsProject> result = new GridEntity<HiomsProject>();
		
		project.setIsValid(Constant.HIOMS_VALID_YES);
		Page<HiomsProject> projects = projectService.listProject(project,page,rows);
		
		result.setTotal(projects.getTotal());
		result.getRows().addAll(projects.getRows());
		
		return result;
	}

}
