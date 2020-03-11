package com.taikang.jkx;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.util.NumberUtil;
import com.taikang.jkx.mapper.HiomsTreatmentShenfenzhengMapper;
import com.taikang.jkx.mapper.HiomsTreatmentTmMapper;
import com.taikang.jkx.model.HiomsTreatmentShenfenzheng;
import com.taikang.jkx.model.HiomsTreatmentShenfenzhengExample;
import com.taikang.jkx.model.HiomsTreatmentTm;
import com.taikang.jkx.model.HiomsTreatmentTmExample;
import com.taikang.jkx.model.HiomsTreatmentTmExample.Criteria;
/**
 * 计算交叉住院的案件
 * @author zhqh9016
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplition.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Recount_tm5 {

	@Autowired
	private HiomsTreatmentTmMapper hiomsTreatmentTmMapper;
	@Autowired
	private HiomsTreatmentShenfenzhengMapper hiomsTreatmentShenfenzhengMapper;

	@Test
	public void fun1() throws ParseException {

		HiomsTreatmentTmExample example = new HiomsTreatmentTmExample();

		// 统计总条数
		HiomsTreatmentShenfenzhengExample shenfenzhengExample = new HiomsTreatmentShenfenzhengExample();
		long countByExample = hiomsTreatmentShenfenzhengMapper.countByExample(shenfenzhengExample);
		long startTime = System.currentTimeMillis();
		// 分页遍历个人编号号码
		for (long i = 0; i < countByExample; i += 100) {
			System.out.println(i);
			shenfenzhengExample.setLimit(100);
			shenfenzhengExample.setOffset(i);
			List<HiomsTreatmentShenfenzheng> selectByExample = hiomsTreatmentShenfenzhengMapper
					.selectByExample(shenfenzhengExample);
			for (HiomsTreatmentShenfenzheng hiomsTreatmentShenfenzheng : selectByExample) {
				String shenfenzheng = hiomsTreatmentShenfenzheng.getShenfenzheng();
				example.clear();
				example.setOrderByClause("ruyuanshijian");
				Criteria criteria = example.createCriteria();
				criteria.andGerenbianhaoEqualTo(shenfenzheng);
				List<HiomsTreatmentTm> selectByExample2 = hiomsTreatmentTmMapper.selectByExample(example);
				for (int j = 0; j < selectByExample2.size(); j++) {
					HiomsTreatmentTm hiomsTreatmentTm = selectByExample2.get(j);
					HiomsTreatmentTm hiomsTreatmentTM2 = null;
					if(j+1<selectByExample2.size()){
						for(int m = j+1;m<selectByExample2.size();m++){
							hiomsTreatmentTM2 = selectByExample2.get(m);
							if(hiomsTreatmentTM2.getRuyuanshijian().compareTo(hiomsTreatmentTm.getChuyuanshijian())<0 && hiomsTreatmentTM2.getDabingbaoxianzhifu()>0){
								hiomsTreatmentTm.setShenfenzheng("1");
								hiomsTreatmentTmMapper.updateByPrimaryKey(hiomsTreatmentTm);
								hiomsTreatmentTM2.setShenfenzheng("1");
								hiomsTreatmentTmMapper.updateByPrimaryKey(hiomsTreatmentTM2);
							}
						}
					}
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("共用时：" + (endTime - startTime) / 1000 + "秒");
	}
}
