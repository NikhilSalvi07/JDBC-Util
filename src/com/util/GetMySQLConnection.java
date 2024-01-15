package com.util;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class GetMySQLConnection {

		private static Connection conn;
		private static MysqlDataSource ds;
		
	static {
		ds=new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("pass1010");
		ds.setServerName("localhost");
		ds.setDatabaseName("nikhil");
		ds.setPortNumber(3306);
	}
	public GetMySQLConnection() {
		super();
	}
public static Connection getMyConnection() {
	try {
		conn=ds.getConnection();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return conn;
}
}
