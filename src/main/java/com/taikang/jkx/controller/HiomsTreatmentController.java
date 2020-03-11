package com.taikang.jkx.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.HiomsTreatmentTm;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.model.TreatmentRequestParam;
import com.taikang.jkx.service.TreatmentService;

@RestController
@RequestMapping("treatment")
public class HiomsTreatmentController {
	@Autowired
	private TreatmentService treatmentService ;

	/**
	 * 结算信息条件查询
	 *
	 * @param param
	 * @return
	 */
	@RequestMapping(path="findTreatment",method=RequestMethod.POST)
	public GridEntity<HiomsTreatmentTm> fundAll(TreatmentRequestParam param){
		GridEntity<HiomsTreatmentTm> result = new GridEntity<>();
		Page<HiomsTreatmentTm> treatments = treatmentService.findTreamtPageable(param);
		
		result.setTotal(treatments.getTotal());
		result.getRows().addAll(treatments.getRows());
		return result;
	}
	
	/**
	 * 结算信息上传
	 * @param request
	 * @param groupId
	 * @return
	 * @throws IOException
	 * @throws ParseException 
	 */
	@RequestMapping(path="importTreatment",method=RequestMethod.POST)
	public AjaxResponse importTreatment(HttpServletRequest request,String groupId) throws IOException, ParseException{
		AjaxResponse result = new AjaxResponse();
		//先校验统筹区有没有选
		if(StringUtils.isEmpty(groupId)){
			result.setState(false);
			result.setMessage("未执行导入操作,统筹区为必选项");
			return result;
		}
		//执行结算信息保存
		result = treatmentService.importTreatment(request ,groupId);
		return result;
	}
}
