package com.lowry.phone.business.factory;

import com.lowry.phone.business.ebi.PhoneEbi;
import com.lowry.phone.business.ebo.PhoneEbo;

public class PhoneEbiFactory {
	public static PhoneEbi getPhoneEbi(){
		return new PhoneEbo();
	};
}
