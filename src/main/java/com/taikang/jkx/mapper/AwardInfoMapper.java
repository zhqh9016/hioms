package com.taikang.jkx.mapper;

import com.taikang.jkx.model.AwardInfo;
import com.taikang.jkx.model.AwardInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AwardInfoMapper {
    long countByExample(AwardInfoExample example);

    int deleteByExample(AwardInfoExample example);

    int insert(AwardInfo record);

    int insertSelective(AwardInfo record);

    List<AwardInfo> selectByExample(AwardInfoExample example);

    int updateByExampleSelective(@Param("record") AwardInfo record, @Param("example") AwardInfoExample example);

    int updateByExample(@Param("record") AwardInfo record, @Param("example") AwardInfoExample example);
}