package com.taikang.jkx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsAgreement;
import com.taikang.jkx.service.AgreementService;

/**
 * 协议管理
 * @author zhangqh27
 *
 */
@Controller
@RequestMapping("agreement")
public class HiomsAgreementController {
	
	@Autowired
	private AgreementService agreementService;
	
	@RequestMapping(path = "addAgreement", method = RequestMethod.POST)
	public AjaxResponse addAgreement(HiomsAgreement agreement){
		AjaxResponse result = new AjaxResponse();
		
		//int i = agreementService.addAgreement(agreement);
		
		return result;
	}
	

}
