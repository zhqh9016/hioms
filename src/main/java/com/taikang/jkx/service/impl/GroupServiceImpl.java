package com.taikang.jkx.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.common.util.UserUtils;
import com.taikang.jkx.mapper.HiomsGroupMapper;
import com.taikang.jkx.mapper.HiomsUserMapper;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsGroupExample;
import com.taikang.jkx.model.HiomsUserExample;
import com.taikang.jkx.model.HiomsGroupExample.Criteria;
import com.taikang.jkx.model.HiomsUser;
import com.taikang.jkx.service.GroupService;
@Service
public class GroupServiceImpl implements GroupService {
	
	
	@Autowired
	private HiomsGroupMapper groupMapper;
	@Autowired
	private HiomsUserMapper userMapper;
	
	private Map<String,HiomsGroup> cachedGroup = new HashMap<String, HiomsGroup>();
	
	@Override
	public List<HiomsGroup> listGroup(String parentId){
		
		HiomsGroupExample example = new HiomsGroupExample();
		Criteria createCriteria = example.createCriteria();
		if(StringUtils.isEmpty(parentId)){
			parentId = "0";
		}
		createCriteria.andGroupParentIdEqualTo(parentId);
		createCriteria.andValidEqualTo(Constant.HIOMS_VALID_YES);
		List<HiomsGroup> selectByExample = groupMapper.selectByExample(example );
		
		fillChild(selectByExample);
		
		return selectByExample;
	}

	/**
	 * 填充子节点
	 * @param groups
	 */
	private void fillChild(List<HiomsGroup> groups){
		
		if(!CollectionUtils.isEmpty(groups)){
			for (HiomsGroup hiomsGroup : groups) {
				String groupId = hiomsGroup.getGroupId();
				hiomsGroup.setId(hiomsGroup.getGroupId());
				hiomsGroup.setText(hiomsGroup.getGroupName());
				HiomsGroupExample example = new HiomsGroupExample();
				Criteria createCriteria = example.createCriteria();
				createCriteria.andGroupParentIdEqualTo(groupId);
				createCriteria.andValidEqualTo(Constant.HIOMS_VALID_YES);
				List<HiomsGroup> childGroup = groupMapper.selectByExample(example );
				if(!CollectionUtils.isEmpty(childGroup)){
					hiomsGroup.getChildren().addAll(childGroup);
					fillChild(childGroup);
					hiomsGroup.setState("closed");
				}
			}
		}
	}

	/**
	 * 增加组织节点
	 */
	@Override
	public AjaxResponse addGroup(HiomsGroup group) {
		AjaxResponse result = new AjaxResponse();
		result.setState(false);
		//先检测父节点是不是存在
		String groupParentId = group.getGroupParentId();
		if(StringUtils.isEmpty(groupParentId)||"0".equals(groupParentId)){
			result.setMessage("您选择的父节点不合法");
			return result;
		}
		
		//检查本次填写的组织节点是否为空,或已在数据库中存在
		String groupId = group.getGroupId();
		if(StringUtils.isEmpty(groupId)){
			result.setMessage("组织节点ID不能为空");
			return result;
		}
		
		HiomsGroupExample example = new HiomsGroupExample();
		Criteria groupCriteria = example.createCriteria();
		groupCriteria.andGroupIdEqualTo(groupId);
		List<HiomsGroup> selectByExample = groupMapper.selectByExample(example );
		if(selectByExample.size()>0){
			result.setMessage("您当前填写的组织ID已存在!");
			return result;
		}
		
		String groupName = group.getGroupName();
		if(StringUtils.isEmpty(groupName)){
			result.setMessage("组织名称为必填项");
			return result;
		}
		
		HiomsGroupExample example2 = new HiomsGroupExample();
		Criteria groupCriteria2 = example2.createCriteria();
		groupCriteria2.andGroupNameEqualTo(groupName);
		List<HiomsGroup> selectByExample2 = groupMapper.selectByExample(example2 );
		if(selectByExample2.size()>0){
			result.setMessage("您当前填写的组织名称已存在!");
			return result;
		}
		
		group.setCreateTime(new Date(System.currentTimeMillis()));
		group.setCreator(UserUtils.getCurrentUser().getLoginName());
		group.setValid(Constant.HIOMS_VALID_YES);
		groupMapper.insert(group);
		
		result.setState(true);
		result.setMessage("添加成功");
		return result;
	}

	@Override
	public HiomsGroup getGroupByGroupId(String groupId) {
		HiomsGroup result  = null;
		HiomsGroup hiomsGroup = cachedGroup.get(groupId);
		if(hiomsGroup!=null){
			result = hiomsGroup;
		}else{
			HiomsGroup selectByPrimaryKey = groupMapper.selectByPrimaryKey(groupId);
			if(selectByPrimaryKey!=null&&!StringUtils.isEmpty(selectByPrimaryKey.getGroupId())){
				cachedGroup.put(groupId, selectByPrimaryKey);
				result = selectByPrimaryKey;
			}
		}
		return result;
	}

	@Override
	public List<String> getLeafsByGroupId(String groupId) {
		List<String> result = new ArrayList<String>();
		getLeafs(groupId,result,null);
		return result;
	}
	
	/**
	 * 填充组织结构中的叶子节点
	 * @param groupId
	 * @param areas
	 */
	private void getLeafs(String groupId,List<String> areas,List<HiomsGroup> childGroups) {
		if(CollectionUtils.isEmpty(childGroups)){
			HiomsGroupExample groupExample = new HiomsGroupExample();
			com.taikang.jkx.model.HiomsGroupExample.Criteria groupCriteria = groupExample.createCriteria();
			groupCriteria.andGroupParentIdEqualTo(groupId);
			childGroups = groupMapper.selectByExample(groupExample);
		}
		if(!CollectionUtils.isEmpty(childGroups)){
			for (HiomsGroup hiomsGroup : childGroups) {
				String groupId2 = hiomsGroup.getGroupId();
				HiomsGroupExample groupExample2 = new HiomsGroupExample();
				com.taikang.jkx.model.HiomsGroupExample.Criteria groupCriteria2 = groupExample2.createCriteria();
				groupCriteria2.andGroupParentIdEqualTo(groupId2);
				groupCriteria2.andValidEqualTo(Constant.HIOMS_VALID_YES);
				List<HiomsGroup> selectByExample2 = groupMapper.selectByExample(groupExample2 );
				if(!CollectionUtils.isEmpty(selectByExample2)){
					getLeafs(groupId2, areas,selectByExample2);
				}else{
					areas.add(groupId2);
				}
			}
		}else{
			areas.add(groupId);
		}
	}

	/**
	 * 删除组织信息
	 */
	@Override
	public AjaxResponse deleteGroup(String groupId) {
		AjaxResponse result = new AjaxResponse();
		
		int isSucess = deleteGroupDeep(groupId);
		if(isSucess==0){
			result.setState(true);
			result.setMessage("删除成功");
		}
		if(isSucess==1){
			result.setState(false);
			result.setMessage("不成删除该组织，该组织下存在人员");
		}
		
		return result;
	}
	
	/**
	 * 如果删除成功,则返回0,如果删除不成功则返回一个大于0的整数,1代表该组织下扔挂靠着人员.需先将相关人员挂靠到其他组织下或删除.
	 * @param groupId
	 * @return
	 */
	private int deleteGroupDeep(String groupId) {
		
		//先判断该组织下是否有子组织,如果有子组织先遍历子组织.
		HiomsGroupExample groupExample = new HiomsGroupExample();
		Criteria criteria = groupExample.createCriteria();
		criteria.andGroupParentIdEqualTo(groupId);
		criteria.andValidEqualTo(Constant.HIOMS_VALID_YES);
		List<HiomsGroup> list = groupMapper.selectByExample(groupExample);
		if(!CollectionUtils.isEmpty(list)){
			for (HiomsGroup hiomsGroup : list) {
				int deleteGroupDeep = deleteGroupDeep(hiomsGroup.getGroupId());
				if(deleteGroupDeep>0){
					return deleteGroupDeep;
				}
			}
		}
		
		//检查该组织下是否有人员信息
		HiomsUserExample userExample = new HiomsUserExample();
		com.taikang.jkx.model.HiomsUserExample.Criteria userCriteria = userExample.createCriteria();
		userCriteria.andGroupIdEqualTo(groupId);
		userCriteria.andValidEqualTo(Constant.HIOMS_VALID_YES);
		List<HiomsUser> selectByExample = userMapper.selectByExample(userExample);
		if(!CollectionUtils.isEmpty(selectByExample)){
			return 1;
		}else{
			HiomsGroupExample deleteGroupExample = new HiomsGroupExample();
			Criteria deleteGroupCriteria = deleteGroupExample.createCriteria();
			deleteGroupCriteria.andGroupIdEqualTo(groupId);
			
			HiomsGroup groupRecord = groupMapper.selectByPrimaryKey(groupId);
			if(groupRecord!=null&&groupRecord.getGroupId()!=null){
				groupRecord.setValid(Constant.HIOMS_VALID_NO);
				groupMapper.updateByExample(groupRecord , deleteGroupExample);
			}
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
