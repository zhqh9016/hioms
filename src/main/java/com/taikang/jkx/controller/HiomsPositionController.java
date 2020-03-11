package com.taikang.jkx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taikang.jkx.common.Constant;
import com.taikang.jkx.model.AjaxResponse;
import com.taikang.jkx.model.GridEntity;
import com.taikang.jkx.model.HiomsPosition;
import com.taikang.jkx.model.Page;
import com.taikang.jkx.service.PositionService;
import com.taikang.jkx.service.RUserPositionService;

@RestController
@RequestMapping("position")
public class HiomsPositionController {
	
	@Autowired
	private PositionService positionService;
	@Autowired
	private RUserPositionService rUserPositionService;
	
	/**
	 * 根据筛选条件查询岗位信息
	 * @param position
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(path="listPosition",method = RequestMethod.POST)
	public GridEntity<HiomsPosition> listPosition(HiomsPosition position,int page,int rows){
		GridEntity<HiomsPosition> result = new GridEntity<>();
		//默认查询当前有效的岗位
		if(position.getValid() == null){
			position.setValid(Constant.HIOMS_VALID_YES);
		}
		Page<HiomsPosition> positions = positionService.listPosition(null,position,page,rows);
		result.setTotal(positions.getTotal());
		result.getRows().addAll(positions.getRows());
		return result;
	}

	/**
	 * 添加岗位信息
	 * @param position
	 * @return
	 */
	@RequestMapping(path="addPosition",method = RequestMethod.POST)
	public AjaxResponse addPostion(HiomsPosition position){
		AjaxResponse result = new AjaxResponse();
		int addPosition = positionService.addPosition(position);
		result.setState(true);
		result.setMessage("成功添加"+addPosition+"条记录!");
		
		return result;
	}
	
	/**
	 * 删除岗位信息
	 * @param ids
	 * @return
	 */
	@RequestMapping(path="deletePosition",method=RequestMethod.POST)
	public AjaxResponse deletePositionById(String ids){
		AjaxResponse result = new AjaxResponse();
		String[] split = ids.split(",");
		int i = 0;
		for (String string : split) {
			if(!StringUtils.isEmpty(string)){
				int deleteUserById = positionService.deletePositionById(string);
				i+=deleteUserById;
			}
		}
		result.setState(true);
		result.setMessage("共删除"+i+"条记录");
		return result;
	}
	
	/**
	 * 为下拉框提供职位列表
	 * @return
	 */
	@RequestMapping(path="listPosition4ComboTree",method=RequestMethod.POST)
	public List<HiomsPosition> listPosition4ComboTree(String userId){
		
		HiomsPosition position = new HiomsPosition();
		position.setValid(Constant.HIOMS_VALID_YES);
		Page<HiomsPosition> listPosition = positionService.listPosition(userId,position , 0, 100);
		List<HiomsPosition> rows = listPosition.getRows();
		for (HiomsPosition hiomsPosition : rows) {
			hiomsPosition.setId(hiomsPosition.getPositionId());
			hiomsPosition.setText(hiomsPosition.getPositionName());
		}
		return rows;
	}
	
	/**
	 * 为用户指定职位
	 * @param userId
	 * @param positionIds
	 * @return
	 */
	@RequestMapping(path="specifyUserPosition",method=RequestMethod.POST)
	public AjaxResponse specifyUserPosition(String userId,String[] positionIds){
		AjaxResponse result = new AjaxResponse();
		
		//先判断userID和positionIds是否为空,如果不为空再进行下一步的操作
		if(StringUtils.isEmpty(userId)){
			result.setState(false);
			result.setMessage("必须指定要分配岗位的用户");
			return result;
		}
		rUserPositionService.specifyPosition(userId, positionIds);
		result.setState(true);
		result.setMessage("保存成功");
		return result;
	}
}
