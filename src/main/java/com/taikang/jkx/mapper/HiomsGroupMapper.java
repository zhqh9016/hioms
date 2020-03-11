package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsGroup;
import com.taikang.jkx.model.HiomsGroupExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsGroupMapper {
    long countByExample(HiomsGroupExample example);

    int deleteByExample(HiomsGroupExample example);

    int deleteByPrimaryKey(String groupId);

    int insert(HiomsGroup record);

    int insertSelective(HiomsGroup record);

    List<HiomsGroup> selectByExample(HiomsGroupExample example);

    HiomsGroup selectByPrimaryKey(String groupId);

    int updateByExampleSelective(@Param("record") HiomsGroup record, @Param("example") HiomsGroupExample example);

    int updateByExample(@Param("record") HiomsGroup record, @Param("example") HiomsGroupExample example);

    int updateByPrimaryKeySelective(HiomsGroup record);

    int updateByPrimaryKey(HiomsGroup record);
}