package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsProject;
import com.taikang.jkx.model.HiomsProjectExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsProjectMapper {
    long countByExample(HiomsProjectExample example);

    int deleteByExample(HiomsProjectExample example);

    int deleteByPrimaryKey(String projectId);

    int insert(HiomsProject record);

    int insertSelective(HiomsProject record);

    List<HiomsProject> selectByExample(HiomsProjectExample example);

    HiomsProject selectByPrimaryKey(String projectId);

    int updateByExampleSelective(@Param("record") HiomsProject record, @Param("example") HiomsProjectExample example);

    int updateByExample(@Param("record") HiomsProject record, @Param("example") HiomsProjectExample example);

    int updateByPrimaryKeySelective(HiomsProject record);

    int updateByPrimaryKey(HiomsProject record);
}