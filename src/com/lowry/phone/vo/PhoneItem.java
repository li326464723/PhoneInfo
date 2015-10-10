package com.lowry.phone.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.lowry.data.vo.DataItem;

public class PhoneItem implements Serializable{
	private static final long serialVersionUID = 1L;
	private int manufacturer_id = -1;//品牌ID
	private String manufacturer = null;//品牌
	private String model = null;//型号
	private int sdkVersion = -1;//固件版本
	private int platfrom_id = -1;//平台 
	private List<DataItem> datas;//数据
	private Date makeDate = null;//生产日期
	private double price ;//价格
	private int have = 0;
	//....
	public PhoneItem(){
		datas = new ArrayList<DataItem>();
	}
	
	public int getManufacturerId() {
		return manufacturer_id;
	}
	public void setManufacturerId(int manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSdkVersion() {
		return sdkVersion;
	}
	public void setSdkVersion(int sdkVersion) {
		this.sdkVersion = sdkVersion;
	}
	public Date getMakeDate() {
		return makeDate;
	}
	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPlatfromId() {
		return platfrom_id;
	}
	public void setPlatfromId(int platfrom) {
		this.platfrom_id = platfrom;
	}
	
	public List<DataItem> getDatas() {
		return datas;
	}
	public void addDatas(DataItem data) {
		if(!datas.contains(data)){
			datas.add(data);
		}
	}
	public int getHave() {
		return have;
	}

	public void setHave(int have) {
		this.have = have;
	}
	

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + manufacturer_id;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + platfrom_id;
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
		PhoneItem other = (PhoneItem) obj;
		if (manufacturer_id != other.manufacturer_id)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (platfrom_id != other.platfrom_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhoneItem [manufacturer=" + manufacturer_id + ", model=" + model
				+ ", platfrom=" + platfrom_id + ", datas=" + datas + "]";
	}
	
	
}
