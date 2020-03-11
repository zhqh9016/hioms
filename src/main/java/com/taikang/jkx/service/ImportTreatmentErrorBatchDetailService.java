package com.taikang.jkx.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.taikang.jkx.model.ImportTreatmentErrorBatchDetail;
import com.taikang.jkx.model.Page;

public interface ImportTreatmentErrorBatchDetailService {

	public Page<ImportTreatmentErrorBatchDetail> listDetailByBatchNumber(String batchNumber, int page, int rows);

	public HSSFWorkbook downloadBatchDetail(String batchNumber);

}
