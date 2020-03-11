package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsPatrol;
import com.taikang.jkx.model.HiomsPatrolExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsPatrolMapper {
    long countByExample(HiomsPatrolExample example);

    int deleteByExample(HiomsPatrolExample example);

    int deleteByPrimaryKey(String patrolId);

    int insert(HiomsPatrol record);

    int insertSelective(HiomsPatrol record);

    List<HiomsPatrol> selectByExample(HiomsPatrolExample example);

    HiomsPatrol selectByPrimaryKey(String patrolId);

    int updateByExampleSelective(@Param("record") HiomsPatrol record, @Param("example") HiomsPatrolExample example);

    int updateByExample(@Param("record") HiomsPatrol record, @Param("example") HiomsPatrolExample example);

    int updateByPrimaryKeySelective(HiomsPatrol record);

    int updateByPrimaryKey(HiomsPatrol record);
}