package com.taikang.jkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taikang.jkx.mapper.HiomsRUserPositionMapper;
import com.taikang.jkx.model.HiomsRUserPositionExample;
import com.taikang.jkx.model.HiomsRUserPositionExample.Criteria;
import com.taikang.jkx.model.HiomsRUserPositionKey;
import com.taikang.jkx.service.RUserPositionService;

@Service
public class RUserPositionServiceImpl implements RUserPositionService {
	
	@Autowired
	private HiomsRUserPositionMapper hiomsRUserPositionMapper1;

	@Override
	public List<HiomsRUserPositionKey> getPositionsByUserId(String userId) {
		
		HiomsRUserPositionExample example = new HiomsRUserPositionExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<HiomsRUserPositionKey> selectByExample = hiomsRUserPositionMapper1.selectByExample(example );
		return selectByExample;
	}
	
	/**
	 * 保存用户岗位信息
	 * @param userId
	 * @param positionIds
	 * @return
	 */
	@Override
	public void specifyPosition(String userId,String[] positionIds){
		//先删除已有的岗位
		HiomsRUserPositionExample deleteExample = new HiomsRUserPositionExample();
		com.taikang.jkx.model.HiomsRUserPositionExample.Criteria deleteCriteria = deleteExample.createCriteria();
		deleteCriteria.andUserIdEqualTo(userId);
		hiomsRUserPositionMapper1.deleteByExample(deleteExample);
		
		//保存新的关系
		if(positionIds.length>0){
			for(String positionId : positionIds){
				HiomsRUserPositionKey record = new HiomsRUserPositionKey();
				record.setUserId(userId);
				record.setPositionId(positionId);
				hiomsRUserPositionMapper1.insert(record);
			}
		}
	}

}
