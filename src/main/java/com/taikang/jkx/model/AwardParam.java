package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class AwardParam {
	
	private String aid;
	private String LOTTERYID;
	private AwardKeys result = new AwardKeys();
	private List<String> keys = new ArrayList<>();
	
	public List<String> getKeys() {
		return keys;
	}
	public void setKeys(List<String> keys) {
		this.keys = keys;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getLOTTERYID() {
		return LOTTERYID;
	}
	public void setLOTTERYID(String lOTTERYID) {
		LOTTERYID = lOTTERYID;
	}
	public AwardKeys getResult() {
		return result;
	}
	public void setResult(AwardKeys result) {
		this.result = result;
	}
	
}
