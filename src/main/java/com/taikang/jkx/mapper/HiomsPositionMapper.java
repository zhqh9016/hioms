package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsPosition;
import com.taikang.jkx.model.HiomsPositionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsPositionMapper {
    long countByExample(HiomsPositionExample example);

    int deleteByExample(HiomsPositionExample example);

    int deleteByPrimaryKey(String positionId);

    int insert(HiomsPosition record);

    int insertSelective(HiomsPosition record);

    List<HiomsPosition> selectByExample(HiomsPositionExample example);

    HiomsPosition selectByPrimaryKey(String positionId);

    int updateByExampleSelective(@Param("record") HiomsPosition record, @Param("example") HiomsPositionExample example);

    int updateByExample(@Param("record") HiomsPosition record, @Param("example") HiomsPositionExample example);

    int updateByPrimaryKeySelective(HiomsPosition record);

    int updateByPrimaryKey(HiomsPosition record);
}