package com.lowry.phone.business.ebi;

import com.lowry.phone.vo.PhoneItem;

public interface PhoneEbi {
	public boolean addPhoneDataInfo(PhoneItem phone);
	public int getPhoneIdBymodel(PhoneItem phone);
}
