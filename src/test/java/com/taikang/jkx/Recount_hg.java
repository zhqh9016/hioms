package com.taikang.jkx;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taikang.jkx.common.util.NumberUtil;
import com.taikang.jkx.mapper.HiomsTreatmentHgDAO;
import com.taikang.jkx.mapper.HiomsTreatmentShenfenzhengHgDAO;
import com.taikang.jkx.model.HiomsTreatmentHg;
import com.taikang.jkx.model.HiomsTreatmentHgExample;
import com.taikang.jkx.model.HiomsTreatmentHgExample.Criteria;
import com.taikang.jkx.model.HiomsTreatmentShenfenzhengHg;
import com.taikang.jkx.model.HiomsTreatmentShenfenzhengHgExample;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplition.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Recount_hg {
	
	
	
	@Autowired
	private HiomsTreatmentHgDAO hiomsTreatmentHgDAO;
	@Autowired
	private HiomsTreatmentShenfenzhengHgDAO hiomsTreatmentShenfenzhengHgDAO;
	
	@Test
	public void fun1(){
		
		HiomsTreatmentHgExample example = new HiomsTreatmentHgExample();
		
		
		//统计总条数
		HiomsTreatmentShenfenzhengHgExample shenfenzhengExample = new HiomsTreatmentShenfenzhengHgExample();
		long countByExample = hiomsTreatmentShenfenzhengHgDAO.countByExample(shenfenzhengExample);
		long startTime = System.currentTimeMillis();
		//分页遍历身份证号码
		for(long i = 0;i<countByExample;i+=100){
			System.out.println(i);
			shenfenzhengExample.setLimit(100);
			shenfenzhengExample.setOffset(i);
			List<HiomsTreatmentShenfenzhengHg> selectByExample = hiomsTreatmentShenfenzhengHgDAO.selectByExample(shenfenzhengExample);
			for (HiomsTreatmentShenfenzhengHg hiomsTreatmentShenfenzheng : selectByExample) {
				String shenfenzheng = hiomsTreatmentShenfenzheng.getShenfenzheng();
				example.clear();
				example.setOrderByClause("jiesuanshijian");
				Criteria criteria = example.createCriteria();
				criteria.andGerenbianhaoEqualTo(shenfenzheng);
//				criteria.andShenfenzhengEqualTo(shenfenzheng);
				List<HiomsTreatmentHg> selectByExample2 = hiomsTreatmentHgDAO.selectByExample(example);
//				System.out.println("根据身份证查出的数量"+selectByExample2.size());
				float preLargeFee = 0;
				float preLargePay = 0;
				for(int j = 0;j<selectByExample2.size();j++){
					HiomsTreatmentHg hiomsTreatmentTm = selectByExample2.get(j);
//					System.out.println(hiomsTreatmentTm.getShenfenzheng());
					//计算本次进入大病的费用
					//如果是低保户，不计算住院起付线
//					if(Constant.PERSION_CATEGORY_DB.equals(hiomsTreatmentTm.getJiaofeirenyuanleibie())){
//						float  bencijinrudabingfeiyong = NumberUtil.null2Zero(hiomsTreatmentTm.getZhengceneifeiyong())-NumberUtil.null2Zero(hiomsTreatmentTm.getTongchouzhifu())-NumberUtil.null2Zero(hiomsTreatmentTm.getWeibanzhuanzhenkoujianfeiyong());
//						if(bencijinrudabingfeiyong<0){
//							bencijinrudabingfeiyong = 0;
//						}
//						hiomsTreatmentTm.setBencidabingleiji2(bencijinrudabingfeiyong);
//					}else{
//						float  bencijinrudabingfeiyong = NumberUtil.null2Zero(hiomsTreatmentTm.getZhengceneifeiyong())-NumberUtil.null2Zero(hiomsTreatmentTm.getTongchouzhifu())-NumberUtil.null2Zero(hiomsTreatmentTm.getWeibanzhuanzhenkoujianfeiyong())-NumberUtil.null2Zero(hiomsTreatmentTm.getQifuxian());
//						if(bencijinrudabingfeiyong<0){
//							bencijinrudabingfeiyong = 0;
//						}
//						hiomsTreatmentTm.setBencidabingleiji2(bencijinrudabingfeiyong);
//					}
//					String jigoumingcheng = hiomsTreatmentTm.getJigoumingcheng();
//					if((jigoumingcheng.contains("药房")||jigoumingcheng.contains("药店")||jigoumingcheng.endsWith("店")||jigoumingcheng.contains("药"))&&!jigoumingcheng.contains("医院")){
//						hiomsTreatmentTm.setBencidabingleiji2(hiomsTreatmentTm.getBencidabingleiji());
//					}
//					String zhifuleibie = hiomsTreatmentTm.getZhifuleibie();
//					if(zhifuleibie.contains("慢性病")){
//						hiomsTreatmentTm.setBencidabingleiji2(hiomsTreatmentTm.getBencidabingleiji());
//					}
					//直接取银海系统中的本次大病累计金额
					hiomsTreatmentTm.setBencidabingleiji2(hiomsTreatmentTm.getBencidabingleiji());
					hiomsTreatmentTm.setBenciqiandabingleiji(preLargeFee);
					preLargeFee += hiomsTreatmentTm.getBencidabingleiji2();
					
					calculateProcess(hiomsTreatmentTm ,preLargePay);
					hiomsTreatmentTm.setDabingchongsuan( NumberUtil.null2Zero(hiomsTreatmentTm.getDabingchongsuan()));
					preLargePay += hiomsTreatmentTm.getDabingchongsuan();
					hiomsTreatmentHgDAO.updateByPrimaryKey(hiomsTreatmentTm);
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("共用时："+(endTime-startTime)/1000+"秒");
	}
	
	public void calculateProcess(HiomsTreatmentHg hiomsTreatmentHg ,float preLargePay){
		Float benciqiandabingleiji = hiomsTreatmentHg.getBenciqiandabingleiji();
		Float bencidabingleiji2 = hiomsTreatmentHg.getBencidabingleiji2();
		Float stage1 = 0f;
		Float stage2 = 0f;
		Float stage3 = 0f;
		//判断是否是精准扶贫
//		if(Constant.PERSION_CATEGORY_JZ.equals(hiomsTreatmentTm.getJiaofeirenyuanleibie())){
			float total = benciqiandabingleiji+bencidabingleiji2;
			//判断本次进入大病费用加本次前进入大病费用是否超过起付线
			if(hiomsTreatmentHg.getBenciqiandabingleiji()+hiomsTreatmentHg.getBencidabingleiji2()>5000){
				if(NumberUtil.null2Zero(benciqiandabingleiji)<5000){
					if(total<30000){
						stage1 = total - 5000;
					}else if(total<100000){
						stage1 = 30000f-5000f;
						stage2 = total-30000;
					}else{
						stage1 = 30000f-5000f;
						stage2 = 100000f-30000f;
						stage3 = total-100000;
					}
				}else if(NumberUtil.null2Zero(benciqiandabingleiji)<30000){
					if(total<30000){
						stage1 = bencidabingleiji2;
					}else if(total<100000){
						stage1 = 30000-benciqiandabingleiji;
						stage2 = total - 30000;
					}else{
						stage1 = 30000-benciqiandabingleiji;
						stage2 = 100000f-30000f;
						stage3 = total - 100000;
					}
				}else if(NumberUtil.null2Zero(benciqiandabingleiji)<100000){
					if(total<100000){
						stage2 = bencidabingleiji2;
					}else{
						stage2 = 100000f - benciqiandabingleiji;
						stage3 = total - 100000;
					}
				}else{
					stage3 = bencidabingleiji2;
				}
//				float pay = stage1*0.6f+stage2*0.7f+stage3*0.8f;
//				if(pay+preLargePay>350000){
//					hiomsTreatmentHg.setDabingchongsuan(350000-preLargePay);
//				}else{
//					hiomsTreatmentHg.setDabingchongsuan(pay);
//				}
				float pay = stage1*0.55f+stage2*0.65f+stage3*0.75f;
				if(pay+preLargePay>300000){
					hiomsTreatmentHg.setDabingchongsuan(300000-preLargePay);
				}else{
					hiomsTreatmentHg.setDabingchongsuan(pay);
				}
			}else{
				hiomsTreatmentHg.setDabingchongsuan(0f);
			}
//		}else{
//			float total = benciqiandabingleiji+bencidabingleiji2;
//			if(hiomsTreatmentHg.getBenciqiandabingleiji()+hiomsTreatmentHg.getBencidabingleiji2()>12000){
//				if(NumberUtil.null2Zero(benciqiandabingleiji)<12000){
//					if(total<30000){
//						stage1 = total - 12000;
//					}else if(total<100000){
//						stage1 = 30000f-12000f;
//						stage2 = total-30000;
//					}else{
//						stage1 = 30000f-12000f;
//						stage2 = 100000f-30000f;
//						stage3 = total-100000;
//					}
//				}else if(NumberUtil.null2Zero(benciqiandabingleiji)<30000){
//					if(total<30000){
//						stage1 = bencidabingleiji2;
//					}else if(total<100000){
//						stage1 = 30000-benciqiandabingleiji;
//						stage2 = total - 30000;
//					}else{
//						stage1 = 30000-benciqiandabingleiji;
//						stage2 = 100000f-30000f;
//						stage3 = total - 100000;
//					}
//				}else if(NumberUtil.null2Zero(benciqiandabingleiji)<100000){
//					if(total<100000){
//						stage2 = bencidabingleiji2;
//					}else{
//						stage2 = 100000f - benciqiandabingleiji;
//						stage3 = total - 100000;
//					}
//				}else{
//					stage3 = bencidabingleiji2;
//				}
////				float pay = stage1*0.55f+stage2*0.65f+stage3*0.75f;
////				if(pay+preLargePay>300000){
////					hiomsTreatmentHg.setDabingchongsuan(300000-preLargePay);
////				}else{
////					hiomsTreatmentHg.setDabingchongsuan(pay);
////				}
//				float pay = stage1*0.6f+stage2*0.7f+stage3*0.8f;
//				if(pay+preLargePay>350000){
//					hiomsTreatmentHg.setDabingchongsuan(350000-preLargePay);
//				}else{
//					hiomsTreatmentHg.setDabingchongsuan(pay);
//				}
//			}else{
//				hiomsTreatmentHg.setDabingchongsuan(0f);
//			}
//		}
	}
}
