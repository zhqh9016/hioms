package com.taikang.jkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.mapper.HiomsPatrolAttachmentMapper;
import com.taikang.jkx.model.HiomsPatrolAttachment;
import com.taikang.jkx.model.HiomsPatrolAttachmentExample;
import com.taikang.jkx.model.HiomsPatrolAttachmentExample.Criteria;
import com.taikang.jkx.service.PatrolAttachmentService;
@Service
public class PatrolAttachmentServiceImpl implements PatrolAttachmentService {

	@Autowired
	private HiomsPatrolAttachmentMapper attachmentMapper;

	@Override
	public List<HiomsPatrolAttachment> listAttachmentByPatrolId(String patrolId,int source) {
		HiomsPatrolAttachmentExample example = new HiomsPatrolAttachmentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPatrolIdEqualTo(patrolId);
		createCriteria.andSourceEqualTo(source);
		createCriteria.andValidEqualTo(Constant.HIOMS_VALID_YES);
		List<HiomsPatrolAttachment> attachments = attachmentMapper.selectByExample(example );
		return attachments;
	}
}
