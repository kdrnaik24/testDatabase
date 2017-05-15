package com.cybage.dto;

import java.util.ArrayList;

public class Sections
{
	private String label;
	private String sub;
	private String id;
	private ArrayList<Issues> issues;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Issues> getIssues() {
		return issues;
	}
	public void setIssues(ArrayList<Issues> issues) {
		this.issues = issues;
	}
	@Override
	public String toString() {
		return "Sections [label=" + label + ", sub=" + sub + ", id=" + id + ", issues=" + issues + "]";
	}
	
	
	
}
