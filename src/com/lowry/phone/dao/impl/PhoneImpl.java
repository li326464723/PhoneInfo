package com.lowry.phone.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lowry.phone.dao.dao.PhoneDao;
import com.lowry.phone.vo.PhoneItem;
import com.lowry.util.db.DBHelper;

public class PhoneImpl implements PhoneDao{

	@Override
	public boolean addPhone(PhoneItem phone) {
		String sql = "insert into phone (platform,manufacturer,model)values('"
				+ "1" + "','"
				+ phone.getManufacturer() + "','"
				+ phone.getModel()
				+ "')";
		System.out.println(sql);
		return DBHelper.execute(sql);
	}

	@Override
	public int getPhoneIdBymodel(PhoneItem phone) {
		String sql="select id from phone where manufacturer="+phone.getManufacturer() + " and model='" + phone.getModel() + "'";
		System.out.println(sql);
		Statement st=null;
		Connection conn=null;
		int i = -1;
		try {
			conn=DBHelper.getConnection();
			st=conn.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while(rst.next()){
				i = rst.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;
	}

}
