package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class TreatmentRequestParam {
	
	private List<String> groupIds = new ArrayList<String>();
	
	private String idCard;
	
	private String treatmentNumber ;
	
	private String socialCard;
	
	private int page = 1;
	
	private int rows = 20;
	

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTreatmentNumber() {
		return treatmentNumber;
	}

	public void setTreatmentNumber(String treatmentNumber) {
		this.treatmentNumber = treatmentNumber;
	}

	public String getSocialCard() {
		return socialCard;
	}

	public void setSocialCard(String socialCard) {
		this.socialCard = socialCard;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public List<String> getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}
	
}
