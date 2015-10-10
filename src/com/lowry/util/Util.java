package com.lowry.util;

import java.util.ArrayList;
import java.util.List;

import com.lowry.phone.vo.PhoneItem;

public class Util {
	
	public static List<PhoneItem> readExcel2Item(String patch,int appId){
		List<PhoneItem> phones = new ArrayList<PhoneItem>();
		ExcelUtil.read(phones, patch, appId);
		return phones;
	}
	
}
