package com.vehiclemanagement.database;

import java.sql.*;

public class Connection {
	private java.sql.Connection con = null;

	public java.sql.Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Driver driver;
		try {
			driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle", "root", "password123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
}
