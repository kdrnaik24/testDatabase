package com.cybage.dto;

import java.util.ArrayList;

public class Fields 
{	
	private Priority priority;
	 private ArrayList<FixVersion> fixVersions;
	 private String timespent;
	 private Assignee assignee;
	 private String created;
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public ArrayList<FixVersion> getFixVersions() {
		return fixVersions;
	}
	public void setFixVersions(ArrayList<FixVersion> fixVersions) {
		this.fixVersions = fixVersions;
	}
		
	public String getTimespent() {
		return timespent;
	}
	public void setTimespent(String timespent) {
		this.timespent = timespent;
	}
	public Assignee getAssignee() {
		return assignee;
	}
	public void setAssignee(Assignee assignee) {
		this.assignee = assignee;
	}
	
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Fields [priority=" + priority + ", fixVersions=" + fixVersions + ", timespent=" + timespent
				+ ", assignee=" + assignee + ", created=" + created + "]";
	}
	
	
	

}
