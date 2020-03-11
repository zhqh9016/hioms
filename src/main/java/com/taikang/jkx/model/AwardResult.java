package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class AwardResult {
	
	private String lotteryId;
	private List<Awards> results = new ArrayList<>();
	private List<AwardTemp> awardTemp = new ArrayList<AwardTemp>();
	public String getLotteryId() {
		return lotteryId;
	}
	public void setLotteryId(String lotteryId) {
		this.lotteryId = lotteryId;
	}
	public List<Awards> getResults() {
		return results;
	}
	public void setResults(List<Awards> results) {
		this.results = results;
	}
	public List<AwardTemp> getAwardTemp() {
		return awardTemp;
	}
	public void setAwardTemp(List<AwardTemp> awardTemp) {
		this.awardTemp = awardTemp;
	}
}
