package com.lowry.phone.dao.factory;

import com.lowry.phone.dao.dao.PhoneDao;
import com.lowry.phone.dao.impl.PhoneImpl;

public class PhoneDaoFactory {
	public static PhoneDao getPhoneDao(){
		return new PhoneImpl();
	}

}
