package com.cybage.dto;

public class Issues 
{
	private String key;
	private String keyHtml;
	private String img;
	private String summury;
	private String summuryText;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getKeyHtml() {
		return keyHtml;
	}
	public void setKeyHtml(String keyHtml) {
		this.keyHtml = keyHtml;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSummury() {
		return summury;
	}
	public void setSummury(String summury) {
		this.summury = summury;
	}
	public String getSummuryText() {
		return summuryText;
	}
	public void setSummuryText(String summuryText) {
		this.summuryText = summuryText;
	}
	@Override
	public String toString() {
		return "Issues [key=" + key + ", keyHtml=" + keyHtml + ", img=" + img + ", summury=" + summury
				+ ", summuryText=" + summuryText + "]";
	}
	
	
}
