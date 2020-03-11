package com.taikang.jkx.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.HiomsPatrol;
import com.taikang.jkx.model.HiomsPatrolAttachment;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.PatrolAttachmentService;
import com.taikang.jkx.service.PatrolService;

@RestController
@RequestMapping("patrol")
public class HiomsPatrolController {
	
	@Autowired
	private PatrolService patrolService ;
	@Autowired
	private PatrolAttachmentService attachmentService;
	
	
	/**
	 * 查看巡查附件
	 * @param patrolId
	 * @return
	 */
	@RequestMapping(path="listPatrolAttachment",method=RequestMethod.POST)
	public GridEntity<Map<String,String>> listPatrolAttachment(String patrolId,int source){
		GridEntity<Map<String,String>> result = new GridEntity<Map<String,String>>();
		List<HiomsPatrolAttachment> attachs = attachmentService.listAttachmentByPatrolId(patrolId,source);
		for (HiomsPatrolAttachment at : attachs) {
			Map<String,String> fileNode = new HashMap<>();
			fileNode.put("filePath", at.getFilePath()+"/"+at.getFileName()+"."+at.getFileType());
			fileNode.put("fileName", at.getFileName()+"."+at.getFileType());
			fileNode.put("fileType", at.getFileType());
			result.getRows().add(fileNode);
		}
		return result;
	}
	
	
	
	/**
	 * 发起调查任务
	 * @param patrol
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(path="launchPatrol",method=RequestMethod.POST)
	public AjaxResponse launchPatrol(HiomsPatrol patrol,HttpServletRequest request) throws IOException{
		AjaxResponse result = new AjaxResponse();
		
		//保存巡查任务
		patrolService.save(patrol,request);
		result.setState(true);
		result.setMessage("保存成功");
	    return result;
	}
	
	/**
	 * 执行巡查任务
	 * @param patrolId
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(path="execute",method=RequestMethod.POST)
	public AjaxResponse executePatrol(String patrolId,HttpServletRequest request,String executeDescription) throws IOException{
		AjaxResponse result = new AjaxResponse();
		patrolService.execute(patrolId,executeDescription,request);
		result.setState(true);
		result.setMessage("保存成功");
		return result;
	}
	
	/**
	 * 查询当前用户接收到的巡查任务
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path="listreceivedPatrol",method=RequestMethod.POST)
	public GridEntity<HiomsPatrol> listReceivedPatrol(int page, int rows){
		GridEntity<HiomsPatrol> result = new GridEntity<HiomsPatrol>();
		Page<HiomsPatrol> patrols = patrolService.listReceivedPatrol(page,rows);
		result.setTotal(patrols.getTotal());
		result.getRows().addAll(patrols.getRows());
		return result;
	}
	
	/**
	 * 查询当前用户发起的巡查任务
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path="listlaunchedPatrol",method=RequestMethod.POST)
	public GridEntity<HiomsPatrol> listLaunchedPatrol(int page, int rows){
		GridEntity<HiomsPatrol> result = new GridEntity<HiomsPatrol>();
		Page<HiomsPatrol> patrols = patrolService.listLaunchedPatrol(page,rows);
		result.setTotal(patrols.getTotal());
		result.getRows().addAll(patrols.getRows());
		return result;
	}

}
