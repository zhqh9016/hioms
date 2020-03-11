package com.taikang.jkx.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.HiomsGroupMapper;
import com.taikang.jkx.mapper.HiomsProjectMapper;
import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsProject;
import com.taikang.jkx.model.HiomsProjectExample;
import com.taikang.jkx.model.HiomsProjectExample.Criteria;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.ProjectService;
import com.taikang.jkx.tools.UUIDUtil;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private HiomsProjectMapper hiomsProjectMapper;
	@Autowired
	private HiomsGroupMapper hiomsGroupMapper;

	@Override
	public void saveProject(HiomsProject hiomsProject) {
		HiomsUser currentUser = UserUtils.getCurrentUser();
		
		hiomsProject.setCreator(currentUser.getLoginName());
		hiomsProject.setCreateTime(new Date(System.currentTimeMillis()));
		
		String groupId = hiomsProject.getGroupId();
		if(!StringUtils.isEmpty(groupId)){
			HiomsGroup selectByPrimaryKey = hiomsGroupMapper.selectByPrimaryKey(groupId);
			if(selectByPrimaryKey!= null){
				String groupName = selectByPrimaryKey.getGroupName();
				hiomsProject.setGroupName(groupName);
			}
		}
		hiomsProject.setIsValid(Constant.HIOMS_VALID_YES);
		hiomsProject.setProjectId(UUIDUtil.generateUUID());
		hiomsProjectMapper.insert(hiomsProject);
	}

	@Override
	public Page<HiomsProject> listProject(HiomsProject project, int page, int rows) {
		
		Page<HiomsProject> result = new Page<>();
		HiomsProjectExample example = new HiomsProjectExample();
		Criteria createCriteria = example.createCriteria();
		if(!StringUtils.isEmpty(project.getProjectName())){
			createCriteria.andProjectNameLike("%"+project.getProjectName()+"%");
		}
		example.setOffset((long)((page - 1) * rows));
		example.setLimit(rows);
		
		List<HiomsProject> selectByExample = hiomsProjectMapper.selectByExample(example);
		long countByExample = hiomsProjectMapper.countByExample(example);
		result.setTotal(countByExample);
		result.getRows().addAll(selectByExample);
		
		return result;
	}
	
}
