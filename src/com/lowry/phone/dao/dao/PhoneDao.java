package com.lowry.phone.dao.dao;

import com.lowry.phone.vo.PhoneItem;


public interface PhoneDao {
	public boolean addPhone(PhoneItem phone);
	public int getPhoneIdBymodel(PhoneItem phone);
}
