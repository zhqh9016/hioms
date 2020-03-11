package com.taikang.jkx.service;

import java.util.List;

import com.taikang.jkx.model.HiomsRUserPositionKey;

public interface RUserPositionService {

	public List<HiomsRUserPositionKey> getPositionsByUserId(String userId);
	
	public void specifyPosition(String userId, String[] positionIds);

}
