package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
	
	private List<HiomsGroup> children = new ArrayList<HiomsGroup>();
	private String state = "open"; //默认为关闭的
	private String isLeaf ;
	private String id;
	private String text;
	private boolean checked = false;
	
	
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	public List<HiomsGroup> getChildren() {
		return children;
	}
	public void setChildren(List<HiomsGroup> children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
