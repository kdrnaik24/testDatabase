package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="jiradetails")
public class DBModel 
{
	   
	//@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String keyid;
	private String assignee ; 
	private String fixversion ;
	public String getKeyid() {
		return keyid;
	}
	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getFixversion() {
		return fixversion;
	}
	public void setFixversion(String fixversion) {
		this.fixversion = fixversion;
	}
	
	@Override
	public String toString() {
		return "DBModel [keyid=" + keyid + ", assignee=" + assignee + ", fixversion=" + fixversion + "]";
	}
	
	
}
