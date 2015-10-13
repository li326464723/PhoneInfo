package com.lowry.util;

import java.util.ArrayList;
import java.util.List;

import com.lowry.common.AppConst;
import com.lowry.phone.vo.PhoneItem;

public class Util {
	
	public static List<PhoneItem> readExcel2Item(String patch,int appId){
		List<PhoneItem> phones = new ArrayList<PhoneItem>();
		ExcelUtil.read(phones, patch, appId);
		return phones;
	}
	
	/**
	 * @param facturer ��ȡ���ĳ��̱�ʶ
	 * @return ����Լ���ĳ�������
	 * */
	public static String getManufacturer(String facturer){
		String manufacturer = "";
		if(contain(AppConst.MOTOROLA,facturer)){
			manufacturer =  "Ħ������";
		}else if(contain(AppConst.SONYERICSSON, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.SAMSUNG, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.HTC, facturer)){
			manufacturer = "HTC";
		}else if(contain(AppConst.LENOVO, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.HUAWEI, facturer)){
			manufacturer = "��Ϊ";
		}else if(contain(AppConst.LG, facturer)){
			manufacturer = "LG";
		}else if(contain(AppConst.MEIZU, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.OPPO, facturer)){
			manufacturer = "OPPO";
		}else if(contain(AppConst.TCL, facturer)){
			manufacturer = "TCL";
		}else if(contain(AppConst.TIANYU, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.XIAOMI, facturer)){
			manufacturer = "С��";
		}else if(contain(AppConst.ZTE, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.AMAZON, facturer)){
			manufacturer = "����ѷ";
		}else if(contain(AppConst.HISENSE, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.COOLPAD, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.ACER, facturer)){
			manufacturer = "���";
		}else if(contain(AppConst.JINLI, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.PHILIPS, facturer)){
			manufacturer = "������";
		}else if(contain(AppConst.GOOGLE, facturer)){
			manufacturer = "�ȸ�";
		}else if(contain(AppConst.SHENGDA, facturer)){
			manufacturer = "ʢ��";
		}else if(contain(AppConst.KUBI, facturer)){
			manufacturer = "���";
		}else if(contain(AppConst.XIAXIN, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.FANSHANG, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.AINUO, facturer)){
			manufacturer = "��ŵ";
		}else if(contain(AppConst.DELL, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.DPD, facturer)){
			manufacturer = "���մ�";
		}else if (contain(AppConst.HAIER, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.SHARP, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.BBK, facturer)){
			manufacturer = "������";
		}else if(contain(AppConst.NUBIA, facturer)){
			manufacturer = "Ŭ����";
		}else if(contain(AppConst.KONKA, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.DOOV, facturer)){
			manufacturer = "��Ψ";
		}else if(contain(AppConst.CHINAMOBILE, facturer)){
			manufacturer = "�й��ƶ�";
		}else if(contain(AppConst.BEE, facturer)){
			manufacturer = "С�۷�";
		}else if(contain(AppConst.OPSSON, facturer)){
			manufacturer = "ŷ����";
		}else if(contain(AppConst.SMARTISAN, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.IUSAI, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.ETON, facturer)){
			manufacturer = "��ͨ";
		}else if(contain(AppConst.ONEPLUS, facturer)){
			manufacturer = "һ��";
		}else if(contain(AppConst.TSMART, facturer)){
			manufacturer = "����";
		}else if(contain(AppConst.BIRD, facturer)){
			manufacturer = "����";
		}else{
			manufacturer = "����";
		}
		return manufacturer;
	}
	
	private static boolean contain(String[] facturerArray, String facturer) {
		for(String str:facturerArray){
			if(str.equalsIgnoreCase(facturer)){
				return true;
			}
		}
		return false;
	}
	
}
