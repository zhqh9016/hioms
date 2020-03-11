package com.taikang.jkx.mapper;

import com.taikang.jkx.model.ImportTreatmentErrorBatchDetail;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetailExample;
import com.taikang.jkx.model.ImportTreatmentErrorBatchDetailKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImportTreatmentErrorBatchDetailMapper {
    long countByExample(ImportTreatmentErrorBatchDetailExample example);

    int deleteByExample(ImportTreatmentErrorBatchDetailExample example);

    int deleteByPrimaryKey(ImportTreatmentErrorBatchDetailKey key);

    int insert(ImportTreatmentErrorBatchDetail record);

    int insertSelective(ImportTreatmentErrorBatchDetail record);

    List<ImportTreatmentErrorBatchDetail> selectByExample(ImportTreatmentErrorBatchDetailExample example);

    ImportTreatmentErrorBatchDetail selectByPrimaryKey(ImportTreatmentErrorBatchDetailKey key);

    int updateByExampleSelective(@Param("record") ImportTreatmentErrorBatchDetail record, @Param("example") ImportTreatmentErrorBatchDetailExample example);

    int updateByExample(@Param("record") ImportTreatmentErrorBatchDetail record, @Param("example") ImportTreatmentErrorBatchDetailExample example);

    int updateByPrimaryKeySelective(ImportTreatmentErrorBatchDetail record);

    int updateByPrimaryKey(ImportTreatmentErrorBatchDetail record);
}