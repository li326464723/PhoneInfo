package com.lowry.data.vo;

import java.io.Serializable;

public class DataItem implements Serializable{
	private static final long serialVersionUID = 1L;
	private long date;
	private int share;
	private int app_id;
	private int phoneID;
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public int getShare() {
		return share;
	}
	public void setShare(int share) {
		this.share = share;
	}
	public int getAppId() {
		return app_id;
	}
	public void setAppId(int appName) {
		this.app_id = appName;
	}
	
	public int getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + app_id;
		result = prime * result + (int) (date ^ (date >>> 32));
		result = prime * result + phoneID;
		result = prime * result + share;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataItem other = (DataItem) obj;
		if (app_id != other.app_id)
			return false;
		if (date != other.date)
			return false;
		if (phoneID != other.phoneID)
			return false;
		if (share != other.share)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DataItem [date=" + date + ", share=" + share + ", appName="
				+ app_id + "]";
	}

}
