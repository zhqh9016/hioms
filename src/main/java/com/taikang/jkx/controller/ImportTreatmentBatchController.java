package com.taikang.jkx.controller;


import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.ImportTreatmentBatch;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetail;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.ImportTreatmentBatchService;
import com.taikang.jkx.service.ImportTreatmentErrorBatchDetailService;

@RestController
@RequestMapping("importBatch")
public class ImportTreatmentBatchController {
	
	@Autowired
	private ImportTreatmentBatchService importTreatmentBatchService;
	@Autowired
	private ImportTreatmentErrorBatchDetailService errorBatchDetailService;
	
	/**
	 * 展示上传列表
	 * @return
	 */
	@RequestMapping(path="findimportBatch",method = RequestMethod.POST)
	public GridEntity<ImportTreatmentBatch> findimportBatch(int page,int rows){
		GridEntity<ImportTreatmentBatch> result = new GridEntity<>();
		Page<ImportTreatmentBatch> batches = importTreatmentBatchService.findTreatmentBatchPageable(page,rows);
		result.setTotal(batches.getTotal());
		result.getRows().addAll(batches.getRows());
		return result;
	}
	
	/**
	 * 展示上传失败明细
	 * @param batchNumber
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path="importBatchDetail",method=RequestMethod.POST)
	public GridEntity<ImportTreatmentErrorBatchDetail> importBatchDetail(String batchNumber, int page, int rows){
		GridEntity<ImportTreatmentErrorBatchDetail> result = new GridEntity<>();
		
		Page<ImportTreatmentErrorBatchDetail> details =  errorBatchDetailService.listDetailByBatchNumber(batchNumber,page,rows);
		
		result.setTotal(details.getTotal());
		result.getRows().addAll(details.getRows());
		return result;
	}
	
	@RequestMapping(path="downloadBatchDetail",method=RequestMethod.GET)
	public void downloadBatchDetail(String batchNumber,HttpServletResponse response) throws IOException{
		HSSFWorkbook workBook = errorBatchDetailService.downloadBatchDetail(batchNumber);
		
		ServletOutputStream outputStream = response.getOutputStream();
		workBook.write(outputStream);
		response.addHeader("Content-Disposition", "attachment;filename=detail.xls");
	}
}
