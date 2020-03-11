package com.taikang.jkx.service;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsTreatmentTm;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.model.TreatmentRequestParam;

public interface TreatmentService {
	
	public Page<HiomsTreatmentTm> findTreamtPageable(TreatmentRequestParam param);

	public HiomsTreatmentTm findTreatmentByID(String treamentNumber);

	public int updateByPrimaryKey(HiomsTreatmentTm treatment);

	public AjaxResponse importTreatment(HttpServletRequest request, String groupId) throws IOException, ParseException;
	
	
}
