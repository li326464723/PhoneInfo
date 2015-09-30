package test;

import java.util.List;

import com.lowry.phone.util.Util;
import com.lowry.phone.vo.PhoneItem;



public class Test {
	
	public static void main(String[] args) {
		List<PhoneItem> phones = Util.readExcel2Item("G:/机型数据/原始文件/Android手机登录明细20150927.xls", "手Q");
		for(PhoneItem phone : phones){
			System.out.println("=========>>" + phone.toString());
		}
	}

}
