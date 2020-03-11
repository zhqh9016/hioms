package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsTreatmentTm;
import com.taikang.jkx.model.HiomsTreatmentTmExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsTreatmentTmMapper {
    long countByExample(HiomsTreatmentTmExample example);

    int deleteByExample(HiomsTreatmentTmExample example);

    int deleteByPrimaryKey(String jiuzhenbianhao);

    int insert(HiomsTreatmentTm record);

    int insertSelective(HiomsTreatmentTm record);

    List<HiomsTreatmentTm> selectByExample(HiomsTreatmentTmExample example);

    HiomsTreatmentTm selectByPrimaryKey(String jiuzhenbianhao);

    int updateByExampleSelective(@Param("record") HiomsTreatmentTm record, @Param("example") HiomsTreatmentTmExample example);

    int updateByExample(@Param("record") HiomsTreatmentTm record, @Param("example") HiomsTreatmentTmExample example);

    int updateByPrimaryKeySelective(HiomsTreatmentTm record);

    int updateByPrimaryKey(HiomsTreatmentTm record);
}