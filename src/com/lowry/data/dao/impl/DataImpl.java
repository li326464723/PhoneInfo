package com.lowry.data.dao.impl;

import com.lowry.data.dao.dao.DataDao;
import com.lowry.data.vo.DataItem;
import com.lowry.util.db.DBHelper;

public class DataImpl implements DataDao{

	@Override
	public boolean addData(DataItem data) {
		String sql = "insert into data (date,phone_id,share,app_id) values ('"
				+data.getDate() + "','"
				+data.getPhoneID() + "','"
				+data.getShare() + "','"
				+data.getAppId() +"')";
		System.out.println("==============sql============="+ sql);
		return DBHelper.execute(sql);
	}

}
