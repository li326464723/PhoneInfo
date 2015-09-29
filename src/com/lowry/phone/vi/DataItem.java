package com.lowry.phone.vi;

import java.io.Serializable;

public class DataItem implements Serializable{
	private static final long serialVersionUID = 1L;
	private long date;
	private int share;
	private String appName;
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
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + (int) (date ^ (date >>> 32));
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
		if (appName == null) {
			if (other.appName != null)
				return false;
		} else if (!appName.equals(other.appName))
			return false;
		if (date != other.date)
			return false;
		if (share != other.share)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DataItem [date=" + date + ", share=" + share + ", appName="
				+ appName + "]";
	}

}
