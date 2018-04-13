package com.swingDemo.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

	public static Connection getDbcon(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb", "root", "");
			return con;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}
