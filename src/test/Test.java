package test;

import java.util.List;

import com.lowry.phone.util.Util;
import com.lowry.phone.vo.PhoneItem;



public class Test {
	
	public static void main(String[] args) {
		List<PhoneItem> phones = Util.readExcel2Item("G:/��������/ԭʼ�ļ�/Android�ֻ���¼��ϸ20150927.xls", "��Q");
		for(PhoneItem phone : phones){
			System.out.println("=========>>" + phone.toString());
		}
	}

}
