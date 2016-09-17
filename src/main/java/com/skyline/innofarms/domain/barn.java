package com.skyline.innofarms.domain;

import java.util.Date;

public class barn {
	private String barnId;
	private String barnName;
	private String barnType;
	private Date lastUpTime;
	
	public String getBarnId() {
		return barnId;
	}
	public void setBarnId(String barnId) {
		this.barnId = barnId;
	}
	public String getBarnName() {
		return barnName;
	}
	public void setBarnName(String barnName) {
		this.barnName = barnName;
	}
	public String getBarnType() {
		return barnType;
	}
	public void setBarnType(String barnType) {
		this.barnType = barnType;
	}
	public Date getLastUpTime() {
		return lastUpTime;
	}
	public void setLastUpTime(Date lastUpTime) {
		this.lastUpTime = lastUpTime;
	}
	
}
