package com.cybage.dto;

public class Assignee
{
	private String self;
	private String name;
	private String key;
	private String emailAddress;
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Assignee [self=" + self + ", name=" + name + ", key=" + key + ", emailAddress=" + emailAddress + "]";
	}
	
	
}
