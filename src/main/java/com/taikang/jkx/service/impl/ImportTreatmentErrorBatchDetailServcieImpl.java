package com.taikang.jkx.service.impl;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.taikang.jkx.common.util.CustomStringUtil;
import com.taikang.jkx.mapper.ImportTreatmentErrorBatchDetailMapper;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetail;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetailExample;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetailExample.Criteria;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.ImportTreatmentErrorBatchDetailService;

@Service
public class ImportTreatmentErrorBatchDetailServcieImpl implements ImportTreatmentErrorBatchDetailService {

	@Autowired
	private ImportTreatmentErrorBatchDetailMapper batchDetailMapper;

	@Override
	public Page<ImportTreatmentErrorBatchDetail> listDetailByBatchNumber(String batchNumber, int page, int rows) {

		Page<ImportTreatmentErrorBatchDetail> result = new Page<ImportTreatmentErrorBatchDetail>();

		ImportTreatmentErrorBatchDetailExample batchDetailExample = new ImportTreatmentErrorBatchDetailExample();
		Criteria batchDetailCriteria = batchDetailExample.createCriteria();
		if (!StringUtils.isEmpty(batchNumber)) {
			batchDetailCriteria.andBatchNumberEqualTo(batchNumber);
		}

		// 设置分页信息
		batchDetailExample.setOffset((page - 1) * rows);
		batchDetailExample.setLimit(rows);

		List<ImportTreatmentErrorBatchDetail> selectByExample = batchDetailMapper.selectByExample(batchDetailExample);
		long countByExample = batchDetailMapper.countByExample(batchDetailExample);

		result.setRows(selectByExample);
		result.setTotal(countByExample);

		return result;
	}

	/**
	 * 下载上传失败明细信息
	 */
	@Override
	public HSSFWorkbook downloadBatchDetail(String batchNumber) {
		// 定义表头
		String[] title = { "结算信息上传批次号", "就诊编号", "身份证号", "问题描述", "历史上传大病赔付金额", "本次上传大病赔付金额" };
		// 创建excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		// 创建工作表sheet
		HSSFSheet sheet = null;
		
		ImportTreatmentErrorBatchDetailExample batchDetailExample = new ImportTreatmentErrorBatchDetailExample();
		Criteria criteria = batchDetailExample.createCriteria();
		criteria.andBatchNumberEqualTo(batchNumber);
		long countByExample = batchDetailMapper.countByExample(batchDetailExample);
		
		int countDetails = 0;
		
		for(long i = 0;i<=countByExample;i+=1000){
			
			batchDetailExample.setOffset((int)i);
			batchDetailExample.setLimit(1000);
			
			List<ImportTreatmentErrorBatchDetail> selectByExample = batchDetailMapper.selectByExample(batchDetailExample);
			if(!CollectionUtils.isEmpty(selectByExample)){
				for (ImportTreatmentErrorBatchDetail importTreatmentErrorBatchDetail : selectByExample) {
					//每30万行放在一个表里.
					if(countDetails % 300000 == 0){
						sheet = workbook.createSheet();
						// 创建第一行
						HSSFRow row = sheet.createRow(0);
						HSSFCell cell = null;
						// 插入第一行数据的表头
						for (int m = 0; m < title.length; m++) {
							cell = row.createCell(m);
							cell.setCellValue(title[m]);
						}
						countDetails = 1;
					}
					
					// 写入数据
					HSSFRow nrow = sheet.createRow(countDetails);
					HSSFCell ncell = nrow.createCell(0);
					ncell.setCellValue(CustomStringUtil.nullToEmptyString(importTreatmentErrorBatchDetail.getBatchNumber()));
					ncell = nrow.createCell(1);
					ncell.setCellValue(CustomStringUtil.nullToEmptyString(importTreatmentErrorBatchDetail.getTreatmentNumber()));
					ncell = nrow.createCell(2);
					ncell.setCellValue(CustomStringUtil.nullToEmptyString(importTreatmentErrorBatchDetail.getIdCard()));
					ncell = nrow.createCell(3);
					ncell.setCellValue(CustomStringUtil.nullToEmptyString(importTreatmentErrorBatchDetail.getDescription()));
					ncell = nrow.createCell(4);
					ncell.setCellValue(CustomStringUtil.nullToEmptyString(importTreatmentErrorBatchDetail.getLargeFeeOld()));
					ncell = nrow.createCell(5);
					ncell.setCellValue(CustomStringUtil.nullToEmptyString(importTreatmentErrorBatchDetail.getLargeFeeNew()));
					countDetails++;
				}
			}
		}
		return workbook;
	}
	
	

}
