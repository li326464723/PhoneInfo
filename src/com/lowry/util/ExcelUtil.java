package com.lowry.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Cell;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.lowry.data.vo.DataItem;
import com.lowry.phone.vo.PhoneItem;

public class ExcelUtil {

	public static void read(List<PhoneItem> phones, String patch,int appId) {
		try {
			// ��ȡ
			Workbook book = Workbook.getWorkbook(new File(patch));
			Sheet sheet = book.getSheet(0);
			int rows = sheet.getRows();
			System.out.println("=======rows======" + rows);
			for (int i = 1; i < rows; i++) {
				Cell cell[] = sheet.getRow(i);
				PhoneItem temp = new PhoneItem();
				DataItem di = new DataItem();
				di.setAppId(appId);
				System.out.println("======================" + cell[0].getContents());
				//��������
				DateCell dc = (DateCell) cell[0];
				di.setDate(Long.valueOf(dc.getDate().getTime()));
				//ƽ̨
				String platfrom = cell[1].getContents();
				if(platfrom.equalsIgnoreCase("android")){
					temp.setPlatfrom(1);
				}else{
					//����ƽ̨
				}
				//Ʒ��
				temp.setManufacturer(cell[2].getContents());
				//�ͺ�
				temp.setModel(cell[3].getContents());
				//�û���
				String share = cell[4].getContents();
				System.out.println("==============share========" + share);
				di.setShare(Integer.valueOf(share));
				temp.addDatas(di);
				
				if(!phones.contains(temp) && temp.getModel() != null && !"".equals(temp.getModel())&& temp.getDatas().size() > 0){
					phones.add(temp);
				}
				System.out.println("======size=======" + phones.size());
			}
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
	}
}
