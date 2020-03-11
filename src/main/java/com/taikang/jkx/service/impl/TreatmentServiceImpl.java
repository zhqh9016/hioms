package com.taikang.jkx.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.HiomsCbrMapper;
import com.taikang.jkx.mapper.HiomsTreatmentTmMapper;
import com.taikang.jkx.mapper.ImportTreatmentBatchMapper;
import com.taikang.jkx.mapper.ImportTreatmentErrorBatchDetailMapper;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsCbr;
import com.taikang.jkx.model.HiomsCbrExample;
import com.taikang.jkx.model.HiomsCbrExample.Criteria;
import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsTreatmentTm;
import com.taikang.jkx.model.HiomsTreatmentTmExample;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.model.ImportTreatmentBatch;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetail;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.model.TreatmentRequestParam;
import com.taikang.jkx.service.GroupService;
import com.taikang.jkx.service.TreatmentService;
import com.taikang.jkx.tools.ExcelUtil;
import com.taikang.jkx.tools.UUIDUtil;

@Service
public class TreatmentServiceImpl implements TreatmentService {

	@Autowired
	private HiomsTreatmentTmMapper treatmentMapper;
	@Autowired
	private GroupService groupService;
	@Autowired
	private ImportTreatmentErrorBatchDetailMapper errorBatchDetailMapper;
	@Autowired
	private ImportTreatmentBatchMapper batchMapper;
	@Autowired
	private HiomsCbrMapper cbrMapper;

	@Override
	public Page<HiomsTreatmentTm> findTreamtPageable(TreatmentRequestParam param) {
		//需要补上根据条件查询就诊信息的逻辑
		HiomsTreatmentTmExample example = new HiomsTreatmentTmExample();
		com.taikang.jkx.model.HiomsTreatmentTmExample.Criteria criteria = example.createCriteria();
		// 控制用户的数据访问权限,如果前台没有传统筹区信息,那么查询该用户所在的组织下的所有统筹区.
		List<String> areas = new ArrayList<String>();
		if (!CollectionUtils.isEmpty(param.getGroupIds())) {
			areas.addAll(param.getGroupIds());
		} else {
			HiomsUser currentUser = UserUtils.getCurrentUser();
			String groupId = currentUser.getGroupId();
			List<String> leafs = groupService.getLeafsByGroupId(groupId);
			areas.addAll(leafs);
		}
		if (!CollectionUtils.isEmpty(areas)) {
			criteria.andGroupIdIn(areas);
		}

		if (!StringUtils.isEmpty(param.getIdCard())) {
			criteria.andShenfenzhengEqualTo(param.getIdCard().trim());
		}
		if (!StringUtils.isEmpty(param.getTreatmentNumber())) {

			criteria.andJiuzhenbianhaoEqualTo(param.getTreatmentNumber().trim());
		}
		if (!StringUtils.isEmpty(param.getSocialCard())) {
			criteria.andGerenbianhaoEqualTo(param.getSocialCard().trim());
		}

		example.setLimit(param.getRows());
		example.setOffset(new Long((param.getPage() - 1) * param.getRows()));
		List<HiomsTreatmentTm> selectByExample = treatmentMapper.selectByExample(example);
		long countByExample = treatmentMapper.countByExample(example);

		Page<HiomsTreatmentTm> result = new Page<HiomsTreatmentTm>();
		result.setRows(selectByExample);
		result.setTotal(countByExample);

		return result;
	}

	@Override
	public HiomsTreatmentTm findTreatmentByID(String treamentNumber) {
		HiomsTreatmentTm selectByPrimaryKey = treatmentMapper.selectByPrimaryKey(treamentNumber);

		return selectByPrimaryKey;
	}

	@Override
	public int updateByPrimaryKey(HiomsTreatmentTm treatment) {
		int key = treatmentMapper.updateByPrimaryKey(treatment);
		return key;
	}

	@Override
	public AjaxResponse importTreatment(HttpServletRequest request,String groupIdFromFrontPage) throws IOException, ParseException {
		
		HiomsUser currentUser = UserUtils.getCurrentUser();
		HiomsGroup group = groupService.getGroupByGroupId(groupIdFromFrontPage);
		String groupName = group.getGroupName();
		
		AjaxResponse result = new AjaxResponse();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		List<MultipartFile> files = multipartRequest.getFiles("import_file");
		if(files.size()==0){
			result.setState(false);
			result.setMessage("未检测到上传的附件");
			return result;
		}
		MultipartFile multipartFile = files.get(0);
		String originalFilename = multipartFile.getOriginalFilename();
		String batchId = UUIDUtil.generateUUID();
		Integer errorNum = 0;
		Integer successNum = 0;
		//解析xls文件
		if(originalFilename.endsWith("xls")){
			InputStream inputStream = multipartFile.getInputStream();
			HSSFWorkbook hssfWB = new HSSFWorkbook(inputStream);
			//天门的导入逻辑
			if(Constant.Group_City_ID_TM.equals(group.getGroupParentId())){
				try {
					if(hssfWB.getNumberOfSheets()<=0){
						result.setState(false);
						result.setMessage("上传的excel文件没有表格");
						return result;
					}
					HSSFSheet sheetAt = hssfWB.getSheetAt(0);
					//先校验第一行的名称
					boolean checkFirstRowResult = checkFirstRow4Tianmen(sheetAt);
					if(!checkFirstRowResult){
						result.setState(false);
						result.setMessage("请使用正确的模板导入天门数据");
						return result;
					}
					
					
					for(int rowNum = 1;rowNum <= sheetAt.getLastRowNum();rowNum++){
						HSSFRow row = sheetAt.getRow(rowNum);
						if(row == null){
							continue;
						}
						//需要对上传的批次做记录
						String groupId = groupIdFromFrontPage;
						
						//读取就诊编号信息
						String jiuzhenbianhao = ExcelUtil.parseExcel(row.getCell(29));
						//读取参保人姓名信息
						String xingming  = row.getCell(2).getStringCellValue();
						//读取身份证号
						String shenfenzheng = ExcelUtil.parseExcel(row.getCell(1));
						//===校验统筹区是否存在====
						if(group == null || StringUtils.isEmpty(group.getGroupId())){
							//如果填写的统筹区不存在,不存储
							ImportTreatmentErrorBatchDetail errorDetail = new ImportTreatmentErrorBatchDetail();
							errorDetail.setBatchNumber(batchId);
							errorDetail.setIdCard(shenfenzheng);
							errorDetail.setTreatmentNumber(jiuzhenbianhao);
							errorDetail.setDescription("统筹区不存在");
							errorBatchDetailMapper.insert(errorDetail );
							errorNum++;
							continue;
						}
						//====校验参保人身份证号是否在我司参保人名单中====
						HiomsCbrExample cbrExample = new HiomsCbrExample();
						Criteria cbrCriteria = cbrExample.createCriteria();
						cbrCriteria.andCbrIdCardEqualTo(shenfenzheng);
						List<HiomsCbr> selectByExample = cbrMapper.selectByExample(cbrExample);
						if(CollectionUtils.isEmpty(selectByExample)){
							ImportTreatmentErrorBatchDetail errorDetail = new ImportTreatmentErrorBatchDetail();
							errorDetail.setBatchNumber(batchId);
							errorDetail.setIdCard(shenfenzheng);
							errorDetail.setTreatmentNumber(jiuzhenbianhao);
							errorDetail.setDescription("不在我司参保名单中");
							errorBatchDetailMapper.insert(errorDetail );
							errorNum++;
							continue;
						}
						//===校验就诊编号是否重复====
						HiomsTreatmentTm selectByPrimaryKey = treatmentMapper.selectByPrimaryKey(jiuzhenbianhao);
						if(selectByPrimaryKey!=null&&!StringUtils.isEmpty(selectByPrimaryKey.getJiuzhenbianhao())){
							ImportTreatmentErrorBatchDetail errorDetail = new ImportTreatmentErrorBatchDetail();
							errorDetail.setBatchNumber(batchId);
							errorDetail.setIdCard(shenfenzheng);
							errorDetail.setTreatmentNumber(jiuzhenbianhao);
							String largeFeeNew = ExcelUtil.parseExcel(row.getCell(31));
							errorDetail.setLargeFeeNew(Float.valueOf(largeFeeNew));
							Float largeFeeOld = selectByPrimaryKey.getDabingbaoxianzhifu();
							errorDetail.setLargeFeeOld(largeFeeOld);
							errorDetail.setDescription("就诊编号已存在");
							errorBatchDetailMapper.insert(errorDetail );
							errorNum++;
							continue;
						}
						
						String gerenbianhao = ExcelUtil.parseExcel(row.getCell(0));
						String xingbie = ExcelUtil.parseExcel(row.getCell(3));
						String nianling = ExcelUtil.parseExcel(row.getCell(4));
						String jiaofeirenyuanleibie = ExcelUtil.parseExcel(row.getCell(5));
						String jigoumingcheng = ExcelUtil.parseExcel(row.getCell(6));
						String zhifudidian = ExcelUtil.parseExcel(row.getCell(7));
						String zhifuleibie = ExcelUtil.parseExcel(row.getCell(8));
						String ruyuanshijian = ExcelUtil.parseExcel(row.getCell(9));
						String chuyuanshijian = ExcelUtil.parseExcel(row.getCell(10));
						String zhuyuanhao = ExcelUtil.parseExcel(row.getCell(11));
						String jiesuanshijian = ExcelUtil.parseExcel(row.getCell(12));
						String chuyuanzhenduan = ExcelUtil.parseExcel(row.getCell(13));
						String feiyongzonge = ExcelUtil.parseExcel(row.getCell(14));
						String zhengcewaizifei = ExcelUtil.parseExcel(row.getCell(15));
						String zhengceneiquanzifujine = ExcelUtil.parseExcel(row.getCell(16));
						String caobiaozifujine = ExcelUtil.parseExcel(row.getCell(17));
						String zhengceneifeiyong = ExcelUtil.parseExcel(row.getCell(18));
						String qifuxian = ExcelUtil.parseExcel(row.getCell(19));
						String tongchouzhifu = ExcelUtil.parseExcel(row.getCell(20));
						String dabingzhifu = ExcelUtil.parseExcel(row.getCell(21));
						String zhuyuanzhenliaofei = ExcelUtil.parseExcel(row.getCell(22));
						String bencidabingleiji = ExcelUtil.parseExcel(row.getCell(23));
						String weiguifeiyong = ExcelUtil.parseExcel(row.getCell(24));
						String gerenfuxian = ExcelUtil.parseExcel(row.getCell(25));
						String jiesuanren = ExcelUtil.parseExcel(row.getCell(26));
						String zhifuduixiang = ExcelUtil.parseExcel(row.getCell(27));
						String shifoujishijiesuan = ExcelUtil.parseExcel(row.getCell(28));
						String dabingbaoxianqifuxian = ExcelUtil.parseExcel(row.getCell(30));
						String dabingbaoxianzhifu = ExcelUtil.parseExcel(row.getCell(31));
						String weibanzhuanzhenkoujianfeiyong = ExcelUtil.parseExcel(row.getCell(32));
						String dangnianduzhuyuancishu = ExcelUtil.parseExcel(row.getCell(33));
						String dianhua = ExcelUtil.parseExcel(row.getCell(34));
						String zhifuren = ExcelUtil.parseExcel(row.getCell(35));
						String zhifushijian = ExcelUtil.parseExcel(row.getCell(36));
						String baoxiangongshi = ExcelUtil.parseExcel(row.getCell(37));
						
						HiomsTreatmentTm treatmentRecord = new HiomsTreatmentTm();
						if(gerenbianhao  				   !=null){treatmentRecord.setGerenbianhao  	            (gerenbianhao  				);}
						if(shenfenzheng  				   !=null){treatmentRecord.setShenfenzheng  	            (shenfenzheng  				);}
						if(xingming				           !=null){treatmentRecord.setXingming				        (xingming				        );};
						if(xingbie  				       !=null){treatmentRecord.setXingbie  				        (xingbie  				    );}
						if(nianling  					   !=null){treatmentRecord.setNianling  		            (nianling  					);}
						if(jiaofeirenyuanleibie  		   !=null){treatmentRecord.setJiaofeirenyuanleibie          (jiaofeirenyuanleibie  		);}
						if(jigoumingcheng  		           !=null){treatmentRecord.setJigoumingcheng  		        (jigoumingcheng  		        );}
						if(zhifudidian  			       !=null){treatmentRecord.setZhifudidian  			        (zhifudidian  			    );}
						if(zhifuleibie  			       !=null){treatmentRecord.setZhifuleibie  			        (zhifuleibie  			    );}
						if(ruyuanshijian  		           !=null){treatmentRecord.setRuyuanshijian  		        (new SimpleDateFormat("yyyy-mm-dd HH:MM:SS").parse(ruyuanshijian)		        );}
						if(chuyuanshijian  		           !=null){treatmentRecord.setChuyuanshijian  		        (new SimpleDateFormat("yyyy-mm-dd HH:MM:SS").parse(chuyuanshijian)  		        );}
						if(zhuyuanhao  			           !=null){treatmentRecord.setZhuyuanhao  			        (zhuyuanhao);}
						if(jiesuanshijian  		           !=null){treatmentRecord.setJiesuanshijian  		        (new SimpleDateFormat("yyyy-mm-dd HH:MM:SS").parse(jiesuanshijian)  		        );}
						if(chuyuanzhenduan  		       !=null){treatmentRecord.setChuyuanzhenduan  		        (chuyuanzhenduan)  		    ;}
						if(feiyongzonge  				   !=null){treatmentRecord.setFeiyongzonge  	            (Float.valueOf(feiyongzonge)); }
						if(zhengcewaizifei  		       !=null){treatmentRecord.setZhengcewaizifei  		        (Float.valueOf(zhengcewaizifei)  		    );}
						if(zhengceneiquanzifujine          !=null){treatmentRecord.setZhengceneiquanzifujine        (Float.valueOf(zhengceneiquanzifujine)       );}
						if(caobiaozifujine  		       !=null){treatmentRecord.setCaobiaozifujine  		        (Float.valueOf(caobiaozifujine ) 		    );}
						if(zhengceneifeiyong  	           !=null){treatmentRecord.setZhengceneifeiyong  	        (Float.valueOf(zhengceneifeiyong  )	        );}
						if(qifuxian  					   !=null){treatmentRecord.setQifuxian  		            (Float.valueOf(qifuxian  			)		);}
						if(tongchouzhifu  		           !=null){treatmentRecord.setTongchouzhifu  		        (Float.valueOf(tongchouzhifu  		 )       );}
						if(dabingzhifu  			       !=null){treatmentRecord.setDabingzhifu  			        (Float.valueOf(dabingzhifu  		)	    );}
						if(zhuyuanzhenliaofei  	           !=null){treatmentRecord.setZhuyuanzhenliaofei  	        (Float.valueOf(zhuyuanzhenliaofei  	  )      );}
						if(bencidabingleiji  			   !=null){treatmentRecord.setBencidabingleiji              (Float.valueOf(bencidabingleiji  		)	);}
						if(weiguifeiyong  		           !=null){treatmentRecord.setWeiguifeiyong  		        (Float.valueOf(weiguifeiyong  		   )     );}
						if(gerenfuxian  			       !=null){treatmentRecord.setGerenfuxian  			        (Float.valueOf(gerenfuxian  			)    );}
						if(jiesuanren  			           !=null){treatmentRecord.setJiesuanren  			        (jiesuanren  			        );}
						if(zhifuduixiang  		           !=null){treatmentRecord.setZhifuduixiang  		        (zhifuduixiang  		        );}
						if(shifoujishijiesuan  	           !=null){treatmentRecord.setShifoujishijiesuan  	        (shifoujishijiesuan 	        );}
						if(jiuzhenbianhao  		           !=null){treatmentRecord.setJiuzhenbianhao  		        (jiuzhenbianhao  		        );}
						if(dabingbaoxianqifuxian           !=null){treatmentRecord.setDabingbaoxianqifuxian         (Float.valueOf(dabingbaoxianqifuxian        ));}
						if(dabingbaoxianzhifu  	           !=null){treatmentRecord.setDabingbaoxianzhifu  	        (Float.valueOf(dabingbaoxianzhifu  	        ));}
						if(weibanzhuanzhenkoujianfeiyong   !=null){treatmentRecord.setWeibanzhuanzhenkoujianfeiyong (Float.valueOf(weibanzhuanzhenkoujianfeiyong));}
						if(dangnianduzhuyuancishu  	       !=null){treatmentRecord.setDangnianduzhuyuancishu  	    (Integer.valueOf(dangnianduzhuyuancishu  	    ));}
						if(dianhua 					       !=null){treatmentRecord.setDianhua 					    (dianhua 					    );}
						if(zhifuren  					   !=null){treatmentRecord.setZhifuren  				    (zhifuren  					);}
						if(zhifushijian  				   !=null){treatmentRecord.setZhifushijian  			    (new SimpleDateFormat("yyyy-mm-dd HH:MM:SS").parse(zhifushijian ) 				);}
						if(baoxiangongshi  			       !=null){treatmentRecord.setBaoxiangongshi  			    (baoxiangongshi  			    );}
						                                                                                     
						treatmentRecord.setValid(Constant.HIOMS_VALID_YES);
						treatmentRecord.setPatrolStatus(Constant.HIOMS_PATROL_UNLAUNCH);
						
						treatmentRecord.setGroupId(groupId);
						treatmentRecord.setGroupName(groupName);
						
						treatmentRecord.setRepeatNameNum(1);
						treatmentMapper.insert(treatmentRecord);
						successNum++; 
					}
					
					ImportTreatmentBatch treatmentBatch = new ImportTreatmentBatch();
					treatmentBatch.setBatchNumber(batchId);
					treatmentBatch.setCreateTime(new Date(System.currentTimeMillis()));
					treatmentBatch.setCreatorGroupId(currentUser.getGroupId());
					treatmentBatch.setCreatorGroupName(currentUser.getGroupName());
					treatmentBatch.setCreatorLoginName(currentUser.getLoginName());
					treatmentBatch.setCreatorTrueName(currentUser.getUserName());
					treatmentBatch.setManageGroupId(groupIdFromFrontPage);
					treatmentBatch.setManageGroupName(groupName);
					treatmentBatch.setErrorNum(errorNum);
					treatmentBatch.setSuccessNum(successNum);
					
					batchMapper.insert(treatmentBatch );
					
				} finally {
					hssfWB.close();
				}
			}
			//黄冈的上传逻辑
			if(Constant.Group_City_ID_HG.equals(group.getGroupParentId())){}
			//荆门的上传逻辑
			if(Constant.Group_City_ID_JM.equals(group.getGroupParentId())){}
			
			
		}
		if(originalFilename.endsWith("xlsx")){
			
		}
		result.setState(true);
		result.setMessage("上传成功"+successNum+"条,失败"+errorNum+"条,本次导入批次号为:"+batchId);
		return result;
	}

	/**
	 * 检查上传的模板是否合法
	 * 
	 * @param sheetAt
	 * @return
	 */
	private boolean checkFirstRow4Tianmen(HSSFSheet sheetAt) {
		HSSFRow row = sheetAt.getRow(0);
		if (!Constant.IMPORT_EXCEL_JMCX_COL1.equals(row.getCell(0).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL2.equals(row.getCell(1).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL3.equals(row.getCell(2).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL4.equals(row.getCell(3).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL5.equals(row.getCell(4).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL6.equals(row.getCell(5).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL7.equals(row.getCell(6).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL8.equals(row.getCell(7).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL9.equals(row.getCell(8).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL10.equals(row.getCell(9).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL11.equals(row.getCell(10).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL12.equals(row.getCell(11).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL13.equals(row.getCell(12).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL14.equals(row.getCell(13).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL15.equals(row.getCell(14).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL16.equals(row.getCell(15).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL17.equals(row.getCell(16).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL18.equals(row.getCell(17).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL19.equals(row.getCell(18).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL20.equals(row.getCell(19).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL21.equals(row.getCell(20).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL22.equals(row.getCell(21).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL23.equals(row.getCell(22).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL24.equals(row.getCell(23).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL25.equals(row.getCell(24).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL26.equals(row.getCell(25).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL27.equals(row.getCell(26).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL28.equals(row.getCell(27).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL29.equals(row.getCell(28).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL30.equals(row.getCell(29).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL31.equals(row.getCell(30).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL32.equals(row.getCell(31).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL33.equals(row.getCell(32).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL34.equals(row.getCell(33).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL35.equals(row.getCell(34).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL36.equals(row.getCell(35).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL37.equals(row.getCell(36).getStringCellValue().trim())) {
			return false;
		}
		if (!Constant.IMPORT_EXCEL_JMCX_COL38.equals(row.getCell(37).getStringCellValue().trim())) {
			return false;
		}
		return true;
	}
}
