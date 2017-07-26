package com.cts.MyApplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appsublist")
public class AppSubList {
	
	@Id
	@Column(name="appsublistid")
	private int appsublistid;
	
	@Column(name="applicationid")
	private long applicationId;
	
	@Column(name="subname")
	private String subname;

	public int getAppsublistid() {
		return appsublistid;
	}

	public void setAppsublistid(int appsublistid) {
		this.appsublistid = appsublistid;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	

}
