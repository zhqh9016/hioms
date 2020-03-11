package com.taikang.jkx.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.HiomsGroupMapper;
import com.taikang.jkx.mapper.HiomsPositionMapper;
import com.taikang.jkx.mapper.HiomsRUserPositionMapper;
import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsPosition;
import com.taikang.jkx.model.HiomsPositionExample;
import com.taikang.jkx.model.HiomsPositionExample.Criteria;
import com.taikang.jkx.model.HiomsRUserPositionExample;
import com.taikang.jkx.model.HiomsRUserPositionKey;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.PositionService;
import com.taikang.jkx.tools.UUIDUtil;

@Service
public class PositionServiceImpl implements PositionService {

	@Autowired
	private HiomsPositionMapper hiomsPositionMapper;
	@Autowired
	private HiomsGroupMapper groupMapper;
	@Autowired
	private HiomsRUserPositionMapper userPositionMapper;

	/**
	 * 根据所属组织、岗位名称、是否有效筛选数据
	 */
	@Override
	public Page<HiomsPosition> listPosition(String userId ,HiomsPosition position, int page, int rows) {
		Page<HiomsPosition> result = new Page<HiomsPosition>();
		HiomsPositionExample example = new HiomsPositionExample();
		Criteria criteria = example.createCriteria();
		//岗位名称模糊查询
		if(!StringUtils.isEmpty(position.getPositionName())){
			criteria.andPositionNameLike("%"+position.getPositionName()+"%");
		}
		//根据岗位id查询
		if(!StringUtils.isEmpty(position.getGroupId())){
			criteria.andGroupIdEqualTo(position.getGroupId());
		}
		//当前是否有效
		if(position.getValid()!=null){
			criteria.andValidEqualTo(position.getValid());	
		}
		
		List<HiomsPosition> selectPositionByExample = hiomsPositionMapper.selectByExample(example);
		//如果userID不为空,那么查询出该用户下的所有岗位,并将对应的岗位的checked属性置为true
		List<HiomsRUserPositionKey> userPositions = null;
		if(!StringUtils.isEmpty(userId)){
			HiomsRUserPositionExample userPositionExample = new HiomsRUserPositionExample();
			com.taikang.jkx.model.HiomsRUserPositionExample.Criteria userPositionCriteria = userPositionExample.createCriteria();
			userPositionCriteria.andUserIdEqualTo(userId);
			userPositions = userPositionMapper.selectByExample(userPositionExample );
		}
		
		if(!CollectionUtils.isEmpty(userPositions)){
			for (HiomsRUserPositionKey hiomsRUserPositionKey : userPositions) {
				String positionId = hiomsRUserPositionKey.getPositionId();
				for(HiomsPosition hiomsPosition: selectPositionByExample){
					if(positionId.equals(hiomsPosition.getPositionId())){
						hiomsPosition.setChecked(true);
					}
				}
			}
		}
		
		long countByExample = hiomsPositionMapper.countByExample(example);
		//封装结果
		result.setTotal(countByExample);
		result.getRows().addAll(selectPositionByExample);
		
		return result;
	}
	
	/**
	 * 添加岗位
	 */
	@Override
	public int addPosition(HiomsPosition position){
		String positionId = UUIDUtil.generateUUID();
		position.setPositionId(positionId);
		String groupId = position.getGroupId();
		if(!StringUtils.isEmpty(groupId)){
			HiomsGroup selectByPrimaryKey = groupMapper.selectByPrimaryKey(groupId);
			if(selectByPrimaryKey!=null){
				position.setGroupName(selectByPrimaryKey.getGroupName());
			}
		}
		position.setCreator(UserUtils.getCurrentUser().getLoginName());
		position.setCreateTime(new Date(System.currentTimeMillis()));
		position.setValid(Constant.HIOMS_VALID_YES);
		int insert = hiomsPositionMapper.insert(position);
		return insert;
	}
	
	/**
	 * 根据岗位ID删除岗位
	 */
	@Override
	public int deletePositionById(String positionId){
		HiomsPosition position = hiomsPositionMapper.selectByPrimaryKey(positionId);
		position.setValid(Constant.HIOMS_VALID_NO);
		int updateKeys = 0;
		if(position!=null && !StringUtils.isEmpty(position.getPositionId())){
			hiomsPositionMapper.updateByPrimaryKey(position);
		}
		return updateKeys;
	}
	
}
