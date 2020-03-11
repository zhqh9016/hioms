package com.taikang.jkx.service;


import com.taikang.jkx.model.ImportTreatmentBatch;
import com.taikang.jkx.model.Page;

public interface ImportTreatmentBatchService {

	public Page<ImportTreatmentBatch> findTreatmentBatchPageable(int page,int rows);

}
