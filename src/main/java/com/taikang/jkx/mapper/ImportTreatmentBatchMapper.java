package com.taikang.jkx.mapper;

import com.taikang.jkx.model.ImportTreatmentBatch;
import com.taikang.jkx.model.ImportTreatmentBatchExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImportTreatmentBatchMapper {
    long countByExample(ImportTreatmentBatchExample example);

    int deleteByExample(ImportTreatmentBatchExample example);

    int deleteByPrimaryKey(String batchNumber);

    int insert(ImportTreatmentBatch record);

    int insertSelective(ImportTreatmentBatch record);

    List<ImportTreatmentBatch> selectByExample(ImportTreatmentBatchExample example);

    ImportTreatmentBatch selectByPrimaryKey(String batchNumber);

    int updateByExampleSelective(@Param("record") ImportTreatmentBatch record, @Param("example") ImportTreatmentBatchExample example);

    int updateByExample(@Param("record") ImportTreatmentBatch record, @Param("example") ImportTreatmentBatchExample example);

    int updateByPrimaryKeySelective(ImportTreatmentBatch record);

    int updateByPrimaryKey(ImportTreatmentBatch record);
}