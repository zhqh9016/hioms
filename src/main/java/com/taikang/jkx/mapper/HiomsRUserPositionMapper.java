package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsRUserPositionExample;
import com.taikang.jkx.model.HiomsRUserPositionKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsRUserPositionMapper {
    long countByExample(HiomsRUserPositionExample example);

    int deleteByExample(HiomsRUserPositionExample example);

    int deleteByPrimaryKey(HiomsRUserPositionKey key);

    int insert(HiomsRUserPositionKey record);

    int insertSelective(HiomsRUserPositionKey record);

    List<HiomsRUserPositionKey> selectByExample(HiomsRUserPositionExample example);

    int updateByExampleSelective(@Param("record") HiomsRUserPositionKey record, @Param("example") HiomsRUserPositionExample example);

    int updateByExample(@Param("record") HiomsRUserPositionKey record, @Param("example") HiomsRUserPositionExample example);
}