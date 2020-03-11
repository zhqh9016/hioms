package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsCbr;
import com.taikang.jkx.model.HiomsCbrExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsCbrMapper {
    long countByExample(HiomsCbrExample example);

    int deleteByExample(HiomsCbrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HiomsCbr record);

    int insertSelective(HiomsCbr record);

    List<HiomsCbr> selectByExample(HiomsCbrExample example);

    HiomsCbr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HiomsCbr record, @Param("example") HiomsCbrExample example);

    int updateByExample(@Param("record") HiomsCbr record, @Param("example") HiomsCbrExample example);

    int updateByPrimaryKeySelective(HiomsCbr record);

    int updateByPrimaryKey(HiomsCbr record);
}