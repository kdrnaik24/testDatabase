package com.cybage.dto;

import java.util.ArrayList;

public class IssueWrapper 
{
	private ArrayList<Sections> sections;

	public ArrayList<Sections> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Sections> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Wrapper [sections=" + sections + "]";
	}
}
