package model;


import java.sql.DriverManager;
import java.sql.SQLException;

import res.Values;

public class Database {
	
	public static void connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Values.conn=DriverManager.getConnection(Values.dbURL,Values.dbAdmin,Values.dbPassword);
			Values.stmt= Values.conn.createStatement();
			System.out.println("Connected to DB");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	} 
	
	public static void closeDB() {
		try {
			if(Values.conn!=null) {
				Values.conn.close();
				System.out.println("DB Disconnected");
			}
		}catch(SQLException ex) {
				ex.printStackTrace();
			}

	}

}
