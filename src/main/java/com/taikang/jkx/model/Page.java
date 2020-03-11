package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
	
	private long total;
	private List<T> rows = new ArrayList<>();
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
