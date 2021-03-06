package com.lowry.phone.business.ebo;

import java.util.List;

import com.lowry.data.business.factory.DataEbiFactory;
import com.lowry.data.vo.DataItem;
import com.lowry.phone.business.ebi.PhoneEbi;
import com.lowry.phone.dao.factory.PhoneDaoFactory;
import com.lowry.phone.vo.PhoneItem;

public class PhoneEbo implements PhoneEbi{

	@Override
	public boolean addPhoneDataInfo(PhoneItem phone) {
		//
		boolean flag = false;
		if(phone.getManufacturerId() == -1){
			int manufacturerId = PhoneDaoFactory.getPhoneDao().getManufacturerId(phone.getManufacturer());
			if(manufacturerId != -1){
				phone.setManufacturerId(manufacturerId);
			}else{
				flag = PhoneDaoFactory.getPhoneDao().addManufacturer(phone.getManufacturer());
				phone.setManufacturerId(PhoneDaoFactory.getPhoneDao().getManufacturerId(phone.getManufacturer()));
			}
		}
		int id = getPhoneIdBymodel(phone);
		if(id == -1){
			//数据库中没有该机器，需要先录入机器信息
			flag = PhoneDaoFactory.getPhoneDao().addPhone(phone);
			id = getPhoneIdBymodel(phone);
		}
		if(id != -1){
			List<DataItem> datas = phone.getDatas();
			if(datas.size() > 0){
				for(DataItem data : datas){
					data.setPhoneID(id);
					flag = DataEbiFactory.getDataEbi().addData(data);
				}
			}
		}
		return flag;
	}

	@Override
	public int getPhoneIdBymodel(PhoneItem phone) {

		return PhoneDaoFactory.getPhoneDao().getPhoneIdBymodel(phone);
	}
	

}
