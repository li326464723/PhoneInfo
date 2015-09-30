package com.lowry.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	private static String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static String SQLURI = "jdbc:mysql://localhost:3306/phone_info?user=root&password=192526";
	
	//获取数据库连接
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVERNAME);
			conn = DriverManager.getConnection(SQLURI);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static boolean execute(String sql){
		Connection conn = null;
		try {
			conn = DBHelper.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(DBHelper.getConnection());
	}
}
