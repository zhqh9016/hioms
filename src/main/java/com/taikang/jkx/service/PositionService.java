package com.taikang.jkx.service;

import com.taikang.jkx.model.HiomsPosition;
import com.taikang.jkx.model.Page;

public interface PositionService {

	public Page<HiomsPosition> listPosition(String userId, HiomsPosition position, int page, int rows);

	public int addPosition(HiomsPosition position);

	public int deletePositionById(String positionId);

	

}
