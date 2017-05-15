package com.cybage.dto;

public class FixVersion {
	 private String self;
	 private String id;
	 private String description;
	 private String name;
	 private boolean archived;
	 private boolean released;
	 private String releaseDate;
	 
	
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public boolean isReleased() {
		return released;
	}
	public void setReleased(boolean released) {
		this.released = released;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "FixVersions [self=" + self + ", id=" + id + ", description=" + description + ", name=" + name
				+ ", archived=" + archived + ", released=" + released + ", releaseDate=" + releaseDate + "]";
	}
	 
	 
	
	

}
