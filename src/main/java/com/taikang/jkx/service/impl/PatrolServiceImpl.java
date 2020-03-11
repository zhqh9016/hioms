package com.taikang.jkx.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.CustomPatrolMapper;
import com.taikang.jkx.mapper.HiomsPatrolAttachmentMapper;
import com.taikang.jkx.mapper.HiomsPatrolMapper;
import com.taikang.jkx.mapper.HiomsTreatmentTmMapper;
import com.taikang.jkx.model.HiomsPatrol;
import com.taikang.jkx.model.HiomsPatrolAttachment;
import com.taikang.jkx.model.HiomsTreatmentTm;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.PatrolService;
import com.taikang.jkx.tools.UUIDUtil;

@Service
public class PatrolServiceImpl implements PatrolService {

	@Autowired
	private HiomsPatrolMapper patrolMapper;
	@Autowired
	private HiomsTreatmentTmMapper treatmentMapper;
	@Autowired
	private HiomsPatrolAttachmentMapper attachmentMapper;
	@Autowired
	private CustomPatrolMapper customPatrolMapper;

	@Value("${attachment.patrol:/}")
	private String attachmentBasePath;

	@Override
	public void save(HiomsPatrol patrol, HttpServletRequest request) throws IOException {

		// 补充完整信息
		HiomsUser currentUser = UserUtils.getCurrentUser();
		patrol.setValid(Constant.HIOMS_VALID_YES);
		patrol.setCreator(currentUser.getLoginName());
		String patrolId = UUIDUtil.generateUUID();
		patrol.setPatrolId(patrolId);
		patrol.setCreateTime(new Date(System.currentTimeMillis()));
		patrol.setCreatorGroupId(currentUser.getGroupId());
		patrol.setStatus(Constant.HIOMS_PATROL_WAIT_PATROL);
		// 保存巡查任务
		patrolMapper.insert(patrol);

		// 处理上传的附件信息
		List<HiomsPatrolAttachment> attachments;
		attachments = uploadLaunchPatrolAttachment(patrol.getPatrolId(),
				patrol.getTreatmentNumber(), request,"attachment/patrol",Constant.HIOMS_PATROL_ATTACHMENT_SOURCE_LAUNCHER);
		if (CollectionUtils.isNotEmpty(attachments)) {
			for (HiomsPatrolAttachment hiomsPatrolAttachment : attachments) {
				attachmentMapper.insert(hiomsPatrolAttachment);
			}
		}

		// 更新就诊信息中的巡查任务状态
		String treatmentNumber = patrol.getTreatmentNumber();
		HiomsTreatmentTm treatment = treatmentMapper.selectByPrimaryKey(treatmentNumber);
		treatment.setPatrolId(patrol.getPatrolId());
		treatment.setPatrolStatus(Constant.HIOMS_PATROL_WAIT_PATROL);
		treatmentMapper.updateByPrimaryKey(treatment);

	}

	/**
	 * 保存巡查任务发起者上传的附件信息
	 * @param patrolId
	 * @param treatmentNumber
	 * @param request
	 * @return
	 * @throws IOException
	 */
	private List<HiomsPatrolAttachment> uploadLaunchPatrolAttachment(String patrolId, String treatmentNumber,
			HttpServletRequest request,String filePath,int source) throws IOException {
		List<HiomsPatrolAttachment> result = new ArrayList<HiomsPatrolAttachment>();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		List<MultipartFile> files = multipartRequest.getFiles("attachment");
		if (CollectionUtils.isNotEmpty(files)) {
			for (MultipartFile multipartFile : files) {
				String originalFilename = multipartFile.getOriginalFilename();
				String[] split = originalFilename.split("\\.");
				String fileName = "";
				String fileType = "";
				if (split.length > 1) {
					fileName = split[0];
					fileType = split[1];
				}
				HiomsPatrolAttachment patrolAttachment = new HiomsPatrolAttachment();
				String attachmentId = UUIDUtil.generateUUID();
				//上传文件的命名规则是附件ID+"-"+上传文件名
				fileName = attachmentId + "-" + fileName;
				patrolAttachment.setAttachmentId(attachmentId);
				patrolAttachment.setFilePath(filePath);
				patrolAttachment.setFileName(fileName);
				patrolAttachment.setFileType(fileType.toLowerCase());
				patrolAttachment.setPatrolId(patrolId);
				patrolAttachment.setSource(source);
				patrolAttachment.setTreatmentNumber(treatmentNumber);
				patrolAttachment.setValid(Constant.HIOMS_VALID_YES);
				
				//将上传的附件保存到指定的文件夹下
				File dst = new File(attachmentBasePath+"/"+fileName+"."+fileType);
				FileOutputStream output = new FileOutputStream(dst);
				InputStream inputStream = multipartFile.getInputStream();
				int i = 0;
				byte[] temp = new byte[2048];
				while((i = inputStream.read(temp))>0){
					output.write(temp, 0, i);
				}
				output.close();
				result.add(patrolAttachment);
			}
		}
		return result;
	}
	
	

	/**
	 * 查询当前登录用户被分配到的巡查任务
	 */
	@Override
	public Page<HiomsPatrol> listReceivedPatrol(int page, int rows) {
		Page<HiomsPatrol> result = new Page<HiomsPatrol>();
		HiomsUser currentUser = UserUtils.getCurrentUser();
		if(currentUser==null){
			return null;
		}
		String userId = currentUser.getUserId();
		Map<String,Object> param = new HashMap<>();
		param.put("userId", userId);
		param.put("start", rows*(page-1));
		param.put("rows", rows);
		List<HiomsPatrol> receivedPatrol = customPatrolMapper.selectReceivedPatrol(param);
		long total = customPatrolMapper.countReceivedPatrol(userId);
		
		result.getRows().addAll(receivedPatrol);
		result.setTotal(total);
		
		return result;
	}

	/**
	 * 执行巡查任务
	 */
	@Override
	public void execute(String patrolId, String executeDescription,HttpServletRequest request) throws IOException {
		//获取当前登录的用户
		HiomsUser currentUser = UserUtils.getCurrentUser();
		String currentUserLoginName = currentUser.getLoginName();
		//查询巡查任务信息
		HiomsPatrol selectPatrol = patrolMapper.selectByPrimaryKey(patrolId);
		//查询结算记录信息
		HiomsTreatmentTm selectTreatment = treatmentMapper.selectByPrimaryKey(selectPatrol.getTreatmentNumber());
		//保存附件信息
		List<HiomsPatrolAttachment> attachments;
		attachments = uploadLaunchPatrolAttachment(selectPatrol.getPatrolId(),selectTreatment.getJiuzhenbianhao(),request,"attachment/patrol",Constant.HIOMS_PATROL_ATTACHMENT_SOURCE_RECIPIENT);
		if (CollectionUtils.isNotEmpty(attachments)) {
			for (HiomsPatrolAttachment hiomsPatrolAttachment : attachments) {
				attachmentMapper.insert(hiomsPatrolAttachment);
			}
		}
		//更新巡查记录状态
		selectPatrol.setStatus(Constant.HIOMS_PATROL_FINISH);
		selectPatrol.setExecuteDescription(executeDescription);
		selectPatrol.setUpdator(currentUserLoginName);
		selectPatrol.setUpdateTime(new Date(System.currentTimeMillis()));
		patrolMapper.updateByPrimaryKey(selectPatrol);
		//更新结算记录巡查状态
		selectTreatment.setPatrolStatus(Constant.HIOMS_PATROL_FINISH);
		treatmentMapper.updateByPrimaryKey(selectTreatment);
	}

	@Override
	public Page<HiomsPatrol> listLaunchedPatrol(int page, int rows) {
		Page<HiomsPatrol> result = new Page<HiomsPatrol>();
		HiomsUser currentUser = UserUtils.getCurrentUser();
		if(currentUser==null){
			return null;
		}
		String loginName = currentUser.getLoginName();
		Map<String,Object> param = new HashMap<>();
		param.put("loginName", loginName);
		param.put("start", rows*(page-1));
		param.put("rows", rows);
		List<HiomsPatrol> receivedPatrol = customPatrolMapper.selectLaunchedPatrol(param);
		long total = customPatrolMapper.countLaunchedPatrol(loginName);
		result.getRows().addAll(receivedPatrol);
		result.setTotal(total);
		
		return result;
	}
}
