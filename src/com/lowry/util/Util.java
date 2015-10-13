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
	 * @param facturer 获取到的厂商标识
	 * @return 返回约定的厂商名称
	 * */
	public static String getManufacturer(String facturer){
		String manufacturer = "";
		if(contain(AppConst.MOTOROLA,facturer)){
			manufacturer =  "摩托罗拉";
		}else if(contain(AppConst.SONYERICSSON, facturer)){
			manufacturer = "索爱";
		}else if(contain(AppConst.SAMSUNG, facturer)){
			manufacturer = "三星";
		}else if(contain(AppConst.HTC, facturer)){
			manufacturer = "HTC";
		}else if(contain(AppConst.LENOVO, facturer)){
			manufacturer = "联想";
		}else if(contain(AppConst.HUAWEI, facturer)){
			manufacturer = "华为";
		}else if(contain(AppConst.LG, facturer)){
			manufacturer = "LG";
		}else if(contain(AppConst.MEIZU, facturer)){
			manufacturer = "魅族";
		}else if(contain(AppConst.OPPO, facturer)){
			manufacturer = "OPPO";
		}else if(contain(AppConst.TCL, facturer)){
			manufacturer = "TCL";
		}else if(contain(AppConst.TIANYU, facturer)){
			manufacturer = "天语";
		}else if(contain(AppConst.XIAOMI, facturer)){
			manufacturer = "小米";
		}else if(contain(AppConst.ZTE, facturer)){
			manufacturer = "中兴";
		}else if(contain(AppConst.AMAZON, facturer)){
			manufacturer = "亚马逊";
		}else if(contain(AppConst.HISENSE, facturer)){
			manufacturer = "海信";
		}else if(contain(AppConst.COOLPAD, facturer)){
			manufacturer = "酷派";
		}else if(contain(AppConst.ACER, facturer)){
			manufacturer = "宏基";
		}else if(contain(AppConst.JINLI, facturer)){
			manufacturer = "金立";
		}else if(contain(AppConst.PHILIPS, facturer)){
			manufacturer = "飞利浦";
		}else if(contain(AppConst.GOOGLE, facturer)){
			manufacturer = "谷歌";
		}else if(contain(AppConst.SHENGDA, facturer)){
			manufacturer = "盛大";
		}else if(contain(AppConst.KUBI, facturer)){
			manufacturer = "酷比";
		}else if(contain(AppConst.XIAXIN, facturer)){
			manufacturer = "夏新";
		}else if(contain(AppConst.FANSHANG, facturer)){
			manufacturer = "梵尚";
		}else if(contain(AppConst.AINUO, facturer)){
			manufacturer = "艾诺";
		}else if(contain(AppConst.DELL, facturer)){
			manufacturer = "戴尔";
		}else if(contain(AppConst.DPD, facturer)){
			manufacturer = "多普达";
		}else if (contain(AppConst.HAIER, facturer)){
			manufacturer = "海尔";
		}else if(contain(AppConst.SHARP, facturer)){
			manufacturer = "夏普";
		}else if(contain(AppConst.BBK, facturer)){
			manufacturer = "步步高";
		}else if(contain(AppConst.NUBIA, facturer)){
			manufacturer = "努比亚";
		}else if(contain(AppConst.KONKA, facturer)){
			manufacturer = "康佳";
		}else if(contain(AppConst.DOOV, facturer)){
			manufacturer = "朵唯";
		}else if(contain(AppConst.CHINAMOBILE, facturer)){
			manufacturer = "中国移动";
		}else if(contain(AppConst.BEE, facturer)){
			manufacturer = "小蜜蜂";
		}else if(contain(AppConst.OPSSON, facturer)){
			manufacturer = "欧博信";
		}else if(contain(AppConst.SMARTISAN, facturer)){
			manufacturer = "锤子";
		}else if(contain(AppConst.IUSAI, facturer)){
			manufacturer = "优赛";
		}else if(contain(AppConst.ETON, facturer)){
			manufacturer = "亿通";
		}else if(contain(AppConst.ONEPLUS, facturer)){
			manufacturer = "一加";
		}else if(contain(AppConst.TSMART, facturer)){
			manufacturer = "天迈";
		}else if(contain(AppConst.BIRD, facturer)){
			manufacturer = "波导";
		}else{
			manufacturer = "其他";
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
