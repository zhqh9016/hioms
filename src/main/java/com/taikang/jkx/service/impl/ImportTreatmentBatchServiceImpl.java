package com.taikang.jkx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.ImportTreatmentBatchMapper;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.ImportTreatmentBatch;
import com.taikang.jkx.model.ImportTreatmentBatchExample;
import com.taikang.jkx.model.ImportTreatmentBatchExample.Criteria;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.GroupService;
import com.taikang.jkx.service.ImportTreatmentBatchService;

@Service
public class ImportTreatmentBatchServiceImpl implements ImportTreatmentBatchService {
	
	@Autowired
	private GroupService groupService;
	@Autowired
	private ImportTreatmentBatchMapper importTreatmentBatchMapper;

	/**
	 * 查询结算信息上传批次号
	 */
	@Override
	public Page<ImportTreatmentBatch> findTreatmentBatchPageable(int page,int rows) {
		
		List<String> areas = new ArrayList<String>();
		
		HiomsUser currentUser = UserUtils.getCurrentUser();
		String groupId = currentUser.getGroupId();
		List<String> leafs = groupService.getLeafsByGroupId(groupId);
		areas.addAll(leafs);
		
		ImportTreatmentBatchExample example = new ImportTreatmentBatchExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andManageGroupIdIn(areas);
		example.setLimit(rows);
		example.setOffset((page-1)*rows);
		List<ImportTreatmentBatch> selectByExample = importTreatmentBatchMapper.selectByExample(example);
		long countByExample = importTreatmentBatchMapper.countByExample(example);
		
		Page<ImportTreatmentBatch> result = new Page<ImportTreatmentBatch>();
		result.setRows(selectByExample);
		result.setTotal(countByExample);
		
		
		return result;
	}

}
