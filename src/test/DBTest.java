package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {
	public static void main(String[] args) {
		System.out.println("=============");
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/phone_info?user=root&password=192526";
		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url);
			boolean b = conn.isClosed();
			System.out.println("=============" + conn.toString());
//			conn.setCatalog("Student");
//			conn.close();
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
