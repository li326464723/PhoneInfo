package com.lowry.phone.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.lowry.data.vo.DataItem;

public class PhoneItem implements Serializable{
	private static final long serialVersionUID = 1L;
	private String manufacturer = null;//Ʒ��
	private String model = null;//�ͺ�
	private int sdkVersion = -1;//�̼��汾
	private String platfrom = null;//ƽ̨
	private List<DataItem> datas;//����
	private Date makeDate = null;//��������
	private double price ;//�۸�
	private int have = 0;
	//....
	public PhoneItem(){
		datas = new ArrayList<DataItem>();
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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
	public String getPlatfrom() {
		return platfrom;
	}
	public void setPlatfrom(String platfrom) {
		this.platfrom = platfrom;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((platfrom == null) ? 0 : platfrom.hashCode());
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
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (platfrom == null) {
			if (other.platfrom != null)
				return false;
		} else if (!platfrom.equals(other.platfrom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhoneItem [manufacturer=" + manufacturer + ", model=" + model
				+ ", platfrom=" + platfrom + ", datas=" + datas + "]";
	}
	
	
}
