package com.taikang.jkx.service;

import java.util.List;

import com.taikang.jkx.model.HiomsPatrolAttachment;

public interface PatrolAttachmentService {

	public List<HiomsPatrolAttachment> listAttachmentByPatrolId(String patrolId,int source);

}
