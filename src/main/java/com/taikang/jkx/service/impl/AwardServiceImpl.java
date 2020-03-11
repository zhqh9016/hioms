package com.taikang.jkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taikang.jkx.mapper.AwardInfoMapper;
import com.taikang.jkx.mapper.AwardTempMapper;
import com.taikang.jkx.mapper.AwardsMapper;
import com.taikang.jkx.model.AwardInfo;
import com.taikang.jkx.model.AwardInfoExample;
import com.taikang.jkx.model.AwardTemp;
import com.taikang.jkx.model.AwardTempExample;
import com.taikang.jkx.model.Awards;
import com.taikang.jkx.model.AwardsExample;
import com.taikang.jkx.model.AwardsExample.Criteria;
import com.taikang.jkx.service.AwardService;

@Service
public class AwardServiceImpl implements AwardService {

	@Autowired
	private AwardsMapper awardMapper;
	@Autowired
	private AwardInfoMapper awardInfoMapper;
	@Autowired
	private AwardTempMapper awardTempMapper;
	
	@Override
	public List<Awards> findAwardByLotteryId(String lotteryId) {
		
		//先查询出所有奖项
		AwardsExample awardsExample = new AwardsExample();
		Criteria awardsCriteria = awardsExample.createCriteria();
		awardsCriteria.andLotteryidEqualTo(lotteryId);
		awardsExample.setOrderByClause("award_order asc");
		List<Awards> awardsList = awardMapper.selectByExample(awardsExample);
		if(awardsList!=null&&awardsList.size()>0){
			//再查询出每个奖项下的中奖人数
			for (Awards awards : awardsList) {
				String aid = awards.getAid();
				AwardInfoExample awardInfoExample = new AwardInfoExample();
				com.taikang.jkx.model.AwardInfoExample.Criteria awardInfoCriteria = awardInfoExample.createCriteria();
				awardInfoCriteria.andAidEqualTo(aid);
				awardInfoExample.setOrderByClause("info_order asc");
				List<AwardInfo> awardInfoList = awardInfoMapper.selectByExample(awardInfoExample);
				awards.getKey().addAll(awardInfoList);
			}
		}
		return awardsList;
	}
	
	

	@Override
	public void updateAwardKeys(String aid, List<String> keys) {
		//先删除该奖项下的所有结果
		AwardInfoExample awardInfoExample = new AwardInfoExample();
		com.taikang.jkx.model.AwardInfoExample.Criteria awardInfoCriteria = awardInfoExample.createCriteria();
		awardInfoCriteria.andAidEqualTo(aid);
		awardInfoMapper.deleteByExample(awardInfoExample);
		
		for(int i = 0;i<keys.size();i++){
			AwardInfo awardInfo = new AwardInfo();
			awardInfo.setAid(aid);
			awardInfo.setKeyName(keys.get(i));
			awardInfo.setInfoOrder(i);
			awardInfoMapper.insert(awardInfo);
			AwardTemp awardTemp = new AwardTemp();
			awardTemp.setAwardInfoName(keys.get(i));
			awardTempMapper.insert(awardTemp);
		}
		
	}

	@Override
	public void deleteAllAwardInfos() {
		AwardInfoExample example = new AwardInfoExample();
		example.createCriteria();
		awardInfoMapper.deleteByExample(example );
		AwardTempExample awardTempExample = new AwardTempExample();
		awardTempExample.createCriteria();
		awardTempMapper.deleteByExample(awardTempExample);
	}



	@Override
	public List<AwardTemp> findAwardTemp() {
		AwardTempExample awardTempExample = new AwardTempExample();
		awardTempExample.createCriteria();
		List<AwardTemp> selectByExample = awardTempMapper.selectByExample(awardTempExample);
		return selectByExample;
	}




}
