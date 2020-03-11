package com.taikang.jkx;

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
 * 比正常赔付提高5个点
 * @author zhqh9016
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplition.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Recount_tm2 {

	@Autowired
	private HiomsTreatmentTmMapper hiomsTreatmentTmMapper;
	@Autowired
	private HiomsTreatmentShenfenzhengMapper hiomsTreatmentShenfenzhengMapper;

	@Test
	public void fun1() {

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
				example.setOrderByClause("jiesuanshijian");
				Criteria criteria = example.createCriteria();
				criteria.andGerenbianhaoEqualTo(shenfenzheng);
				// criteria.andShenfenzhengEqualTo(shenfenzheng);
				List<HiomsTreatmentTm> selectByExample2 = hiomsTreatmentTmMapper.selectByExample(example);
				// System.out.println("根据身份证查出的数量"+selectByExample2.size());
				// 按照系统大病累计进行计算
				float preLargeFee1 = 0;
				float preLargePay1 = 0;
				// 重算本次大病累计
				float preLargeFee2 = 0;
				float preLargePay2 = 0;
				// 按照一般居民计算
				float preLargeFee3 = 0;
				float preLargePay3 = 0;
				for (int j = 0; j < selectByExample2.size(); j++) {
					HiomsTreatmentTm hiomsTreatmentTm = selectByExample2.get(j);
					// System.out.println(hiomsTreatmentTm.getShenfenzheng());
					// 计算本次进入大病的费用
					// 如果是低保户，不计算住院起付线
					if (Constant.PERSION_CATEGORY_DB.equals(hiomsTreatmentTm.getJiaofeirenyuanleibie())) {
						float bencijinrudabingfeiyong = NumberUtil.null2Zero(hiomsTreatmentTm.getZhengceneifeiyong())
								- NumberUtil.null2Zero(hiomsTreatmentTm.getTongchouzhifu())
								- NumberUtil.null2Zero(hiomsTreatmentTm.getWeibanzhuanzhenkoujianfeiyong());
						if (bencijinrudabingfeiyong < 0) {
							bencijinrudabingfeiyong = 0;
						}
						hiomsTreatmentTm.setBencidabingleiji2(bencijinrudabingfeiyong);
					} else {
						float bencijinrudabingfeiyong = NumberUtil.null2Zero(hiomsTreatmentTm.getZhengceneifeiyong())
								- NumberUtil.null2Zero(hiomsTreatmentTm.getTongchouzhifu())
								- NumberUtil.null2Zero(hiomsTreatmentTm.getWeibanzhuanzhenkoujianfeiyong())
								- NumberUtil.null2Zero(hiomsTreatmentTm.getQifuxian());
						if (bencijinrudabingfeiyong < 0) {
							bencijinrudabingfeiyong = 0;
						}
						hiomsTreatmentTm.setBencidabingleiji2(bencijinrudabingfeiyong);
					}
					String jigoumingcheng = hiomsTreatmentTm.getJigoumingcheng();
					if ((jigoumingcheng.contains("药房") || jigoumingcheng.contains("药店") || jigoumingcheng.endsWith("店")
							|| jigoumingcheng.contains("药")) && !jigoumingcheng.contains("医院")) {
						hiomsTreatmentTm.setBencidabingleiji2(hiomsTreatmentTm.getBencidabingleiji());
					}
					String zhifuleibie = hiomsTreatmentTm.getZhifuleibie();
					if (zhifuleibie.contains("慢性病")) {
						hiomsTreatmentTm.setBencidabingleiji2(hiomsTreatmentTm.getBencidabingleiji());
					}
					// 直接取银海系统中的本次大病累计金额
					// hiomsTreatmentTm.setBencidabingleiji2(hiomsTreatmentTm.getBencidabingleiji());
					hiomsTreatmentTm.setBenciqiandabingleiji(preLargeFee1);
					hiomsTreatmentTm.setBenciqiandabingleiji2(preLargeFee2);
					hiomsTreatmentTm.setBenciqiandabingleiji3(preLargeFee3);

					preLargeFee1 += hiomsTreatmentTm.getBencidabingleiji();
					preLargeFee2 += hiomsTreatmentTm.getBencidabingleiji2();
					preLargeFee3 += hiomsTreatmentTm.getBencidabingleiji();

					calculateProcess(hiomsTreatmentTm, preLargePay1, preLargePay2, preLargePay3);

					hiomsTreatmentTm.setDabingchongsuan(NumberUtil.null2Zero(hiomsTreatmentTm.getDabingchongsuan()));
					hiomsTreatmentTm.setDabingchongsuan2(NumberUtil.null2Zero(hiomsTreatmentTm.getDabingchongsuan2()));
					hiomsTreatmentTm.setDabingchongsuan3(NumberUtil.null2Zero(hiomsTreatmentTm.getDabingchongsuan3()));

					preLargePay1 += hiomsTreatmentTm.getDabingchongsuan();
					preLargePay2 += hiomsTreatmentTm.getDabingchongsuan2();
					preLargePay3 += hiomsTreatmentTm.getDabingchongsuan3();

					hiomsTreatmentTmMapper.updateByPrimaryKey(hiomsTreatmentTm);
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("共用时：" + (endTime - startTime) / 1000 + "秒");
	}

	public void calculateProcess(HiomsTreatmentTm hiomsTreatmentTm, float preLargePay1, float preLargePay2,
			float preLargePay3) {
		Float benciqiandabingleiji1 = hiomsTreatmentTm.getBenciqiandabingleiji();
		Float benciqiandabingleiji2 = hiomsTreatmentTm.getBenciqiandabingleiji2();
		Float benciqiandabingleiji3 = hiomsTreatmentTm.getBenciqiandabingleiji3();
		Float bencidabingleiji1 = hiomsTreatmentTm.getBencidabingleiji();
		Float bencidabingleiji2 = hiomsTreatmentTm.getBencidabingleiji2();
		Float bencidabingleiji3 = hiomsTreatmentTm.getBencidabingleiji();
		Float stage11 = 0f;
		Float stage12 = 0f;
		Float stage13 = 0f;
		Float stage21 = 0f;
		Float stage22 = 0f;
		Float stage23 = 0f;
		Float stage31 = 0f;
		Float stage32 = 0f;
		Float stage33 = 0f;
		// 判断是否是精准扶贫
		if (Constant.PERSION_CATEGORY_JZ.equals(hiomsTreatmentTm.getJiaofeirenyuanleibie())) {
			float total = benciqiandabingleiji1 + bencidabingleiji1;
			// 判断本次进入大病费用加本次前进入大病费用是否超过起付线
			if (hiomsTreatmentTm.getBenciqiandabingleiji() + hiomsTreatmentTm.getBencidabingleiji() > 5000) {
				if (NumberUtil.null2Zero(benciqiandabingleiji1) < 5000) {
					if (total < 30000) {
						stage11 = total - 5000;
					} else if (total < 100000) {
						stage11 = 30000f - 5000f;
						stage12 = total - 30000;
					} else {
						stage11 = 30000f - 5000f;
						stage12 = 100000f - 30000f;
						stage13 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji1) < 30000) {
					if (total < 30000) {
						stage11 = bencidabingleiji1;
					} else if (total < 100000) {
						stage11 = 30000 - benciqiandabingleiji1;
						stage12 = total - 30000;
					} else {
						stage11 = 30000 - benciqiandabingleiji1;
						stage12 = 100000f - 30000f;
						stage13 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji1) < 100000) {
					if (total < 100000) {
						stage12 = bencidabingleiji1;
					} else {
						stage12 = 100000f - benciqiandabingleiji1;
						stage13 = total - 100000;
					}
				} else {
					stage13 = bencidabingleiji2;
				}
				float pay = stage11 * 0.65f + stage12 * 0.75f + stage13 * 0.85f;
				if (pay + preLargePay1 > 350000) {
					hiomsTreatmentTm.setDabingchongsuan(350000 - preLargePay1);
				} else {
					hiomsTreatmentTm.setDabingchongsuan(pay);
				}
			} else {
				hiomsTreatmentTm.setDabingchongsuan(0f);
			}
		} else {
			float total = benciqiandabingleiji1 + bencidabingleiji1;
			if (hiomsTreatmentTm.getBenciqiandabingleiji() + hiomsTreatmentTm.getBencidabingleiji() > 12000) {
				if (NumberUtil.null2Zero(benciqiandabingleiji1) < 12000) {
					if (total < 30000) {
						stage11 = total - 12000;
					} else if (total < 100000) {
						stage11 = 30000f - 12000f;
						stage12 = total - 30000;
					} else {
						stage11 = 30000f - 12000f;
						stage12 = 100000f - 30000f;
						stage13 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji1) < 30000) {
					if (total < 30000) {
						stage11 = bencidabingleiji1;
					} else if (total < 100000) {
						stage11 = 30000 - benciqiandabingleiji1;
						stage12 = total - 30000;
					} else {
						stage11 = 30000 - benciqiandabingleiji1;
						stage12 = 100000f - 30000f;
						stage13 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji1) < 100000) {
					if (total < 100000) {
						stage12 = bencidabingleiji1;
					} else {
						stage12 = 100000f - benciqiandabingleiji1;
						stage13 = total - 100000;
					}
				} else {
					stage13 = bencidabingleiji1;
				}
				float pay = stage11 * 0.6f + stage12 * 0.7f + stage13 * 0.8f;
				if (pay + preLargePay1 > 300000) {
					hiomsTreatmentTm.setDabingchongsuan(300000 - preLargePay1);
				} else {
					hiomsTreatmentTm.setDabingchongsuan(pay);
				}
			} else {
				hiomsTreatmentTm.setDabingchongsuan(0f);
			}
		}
		// 判断是否是精准扶贫
		if (Constant.PERSION_CATEGORY_JZ.equals(hiomsTreatmentTm.getJiaofeirenyuanleibie())) {
			float total = benciqiandabingleiji2 + bencidabingleiji2;
			// 判断本次进入大病费用加本次前进入大病费用是否超过起付线
			if (hiomsTreatmentTm.getBenciqiandabingleiji() + hiomsTreatmentTm.getBencidabingleiji2() > 5000) {
				if (NumberUtil.null2Zero(benciqiandabingleiji2) < 5000) {
					if (total < 30000) {
						stage21 = total - 5000;
					} else if (total < 100000) {
						stage21 = 30000f - 5000f;
						stage22 = total - 30000;
					} else {
						stage21 = 30000f - 5000f;
						stage22 = 100000f - 30000f;
						stage23 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji2) < 30000) {
					if (total < 30000) {
						stage21 = bencidabingleiji2;
					} else if (total < 100000) {
						stage21 = 30000 - benciqiandabingleiji2;
						stage22 = total - 30000;
					} else {
						stage21 = 30000 - benciqiandabingleiji2;
						stage22 = 100000f - 30000f;
						stage23 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji2) < 100000) {
					if (total < 100000) {
						stage22 = bencidabingleiji2;
					} else {
						stage22 = 100000f - benciqiandabingleiji2;
						stage23 = total - 100000;
					}
				} else {
					stage23 = bencidabingleiji2;
				}
				float pay = stage21 * 0.65f + stage22 * 0.75f + stage23 * 0.85f;
				if (pay + preLargePay2 > 350000) {
					hiomsTreatmentTm.setDabingchongsuan2(350000 - preLargePay2);
				} else {
					hiomsTreatmentTm.setDabingchongsuan2(pay);
				}
			}
		} else {
			float total = benciqiandabingleiji2 + bencidabingleiji2;
			if (hiomsTreatmentTm.getBenciqiandabingleiji() + hiomsTreatmentTm.getBencidabingleiji2() > 12000) {
				if (NumberUtil.null2Zero(benciqiandabingleiji2) < 12000) {
					if (total < 30000) {
						stage21 = total - 12000;
					} else if (total < 100000) {
						stage21 = 30000f - 12000f;
						stage22 = total - 30000;
					} else {
						stage21 = 30000f - 12000f;
						stage22 = 100000f - 30000f;
						stage23 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji2) < 30000) {
					if (total < 30000) {
						stage21 = bencidabingleiji2;
					} else if (total < 100000) {
						stage21 = 30000 - benciqiandabingleiji2;
						stage22 = total - 30000;
					} else {
						stage21 = 30000 - benciqiandabingleiji2;
						stage22 = 100000f - 30000f;
						stage23 = total - 100000;
					}
				} else if (NumberUtil.null2Zero(benciqiandabingleiji2) < 100000) {
					if (total < 100000) {
						stage22 = bencidabingleiji2;
					} else {
						stage22 = 100000f - benciqiandabingleiji2;
						stage23 = total - 100000;
					}
				} else {
					stage23 = bencidabingleiji2;
				}
				float pay = stage21 * 0.6f + stage22 * 0.7f + stage23 * 0.8f;
				if (pay + preLargePay2 > 300000) {
					hiomsTreatmentTm.setDabingchongsuan2(300000 - preLargePay2);
				} else {
					hiomsTreatmentTm.setDabingchongsuan2(pay);
				}
			}else{
				hiomsTreatmentTm.setDabingchongsuan2(0f);
			}
		}
		float total = benciqiandabingleiji3 + bencidabingleiji3;
		if (hiomsTreatmentTm.getBenciqiandabingleiji3() + hiomsTreatmentTm.getBencidabingleiji() > 12000) {
			if (NumberUtil.null2Zero(benciqiandabingleiji3) < 12000) {
				if (total < 30000) {
					stage31 = total - 12000;
				} else if (total < 100000) {
					stage31 = 30000f - 12000f;
					stage32 = total - 30000;
				} else {
					stage31 = 30000f - 12000f;
					stage32 = 100000f - 30000f;
					stage33 = total - 100000;
				}
			} else if (NumberUtil.null2Zero(benciqiandabingleiji3) < 30000) {
				if (total < 30000) {
					stage31 = bencidabingleiji3;
				} else if (total < 100000) {
					stage31 = 30000 - benciqiandabingleiji3;
					stage32 = total - 30000;
				} else {
					stage31 = 30000 - benciqiandabingleiji3;
					stage32 = 100000f - 30000f;
					stage33 = total - 100000;
				}
			} else if (NumberUtil.null2Zero(benciqiandabingleiji3) < 100000) {
				if (total < 100000) {
					stage32 = bencidabingleiji3;
				} else {
					stage32 = 100000f - benciqiandabingleiji3;
					stage33 = total - 100000;
				}
			} else {
				stage33 = bencidabingleiji3;
			}
			float pay = stage31 * 0.55f + stage32 * 0.65f + stage33 * 0.75f;
			if (pay + preLargePay3 > 300000) {
				hiomsTreatmentTm.setDabingchongsuan3(300000 - preLargePay3);
			} else {
				hiomsTreatmentTm.setDabingchongsuan3(pay);
			}
		} else {
			hiomsTreatmentTm.setDabingchongsuan3(0f);
		}
	}
}
