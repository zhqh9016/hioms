package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsTreatment;
import com.taikang.jkx.model.HiomsTreatmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HiomsTreatmentMapper {
    long countByExample(HiomsTreatmentExample example);

    int deleteByExample(HiomsTreatmentExample example);

    int deleteByPrimaryKey(String treatmentNumber);

    int insert(HiomsTreatment record);

    int insertSelective(HiomsTreatment record);

    List<HiomsTreatment> selectByExample(HiomsTreatmentExample example);

    HiomsTreatment selectByPrimaryKey(String treatmentNumber);

    int updateByExampleSelective(@Param("record") HiomsTreatment record, @Param("example") HiomsTreatmentExample example);

    int updateByExample(@Param("record") HiomsTreatment record, @Param("example") HiomsTreatmentExample example);

    int updateByPrimaryKeySelective(HiomsTreatment record);

    int updateByPrimaryKey(HiomsTreatment record);
}