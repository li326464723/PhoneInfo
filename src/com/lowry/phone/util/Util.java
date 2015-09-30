package com.lowry.phone.util;

import java.util.ArrayList;
import java.util.List;

import com.lowry.phone.vo.PhoneItem;

public class Util {
	
	public static List<PhoneItem> readExcel2Item(String patch,String appName){
		List<PhoneItem> phones = new ArrayList<PhoneItem>();
		ExcelUtil.read(phones, patch, appName);
		return phones;
	}
	
}
