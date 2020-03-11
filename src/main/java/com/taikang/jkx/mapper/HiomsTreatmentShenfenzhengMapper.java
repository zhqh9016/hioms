package com.taikang.jkx.mapper;

import com.taikang.jkx.model.HiomsTreatmentShenfenzheng;
import com.taikang.jkx.model.HiomsTreatmentShenfenzhengExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiomsTreatmentShenfenzhengMapper {
    long countByExample(HiomsTreatmentShenfenzhengExample example);

    int deleteByExample(HiomsTreatmentShenfenzhengExample example);

    int insert(HiomsTreatmentShenfenzheng record);

    int insertSelective(HiomsTreatmentShenfenzheng record);

    List<HiomsTreatmentShenfenzheng> selectByExample(HiomsTreatmentShenfenzhengExample example);

    int updateByExampleSelective(@Param("record") HiomsTreatmentShenfenzheng record, @Param("example") HiomsTreatmentShenfenzhengExample example);

    int updateByExample(@Param("record") HiomsTreatmentShenfenzheng record, @Param("example") HiomsTreatmentShenfenzhengExample example);
}