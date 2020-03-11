package com.taikang.jkx.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.taikang.jkx.model.HiomsPatrol;

@Mapper
public interface CustomPatrolMapper {
	
	public List<HiomsPatrol> selectReceivedPatrol(Map<String, Object> param);

	public long countReceivedPatrol(String userId);

	public List<HiomsPatrol> selectLaunchedPatrol(Map<String, Object> param);

	public long countLaunchedPatrol(String userId);

}
