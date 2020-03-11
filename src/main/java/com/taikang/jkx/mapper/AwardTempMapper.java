package com.taikang.jkx.mapper;

import com.taikang.jkx.model.AwardTemp;
import com.taikang.jkx.model.AwardTempExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AwardTempMapper {
    long countByExample(AwardTempExample example);

    int deleteByExample(AwardTempExample example);

    int insert(AwardTemp record);

    int insertSelective(AwardTemp record);

    List<AwardTemp> selectByExample(AwardTempExample example);

    int updateByExampleSelective(@Param("record") AwardTemp record, @Param("example") AwardTempExample example);

    int updateByExample(@Param("record") AwardTemp record, @Param("example") AwardTempExample example);
}