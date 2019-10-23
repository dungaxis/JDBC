package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	public static Connection getConnection() {
		try {
			final String user = "root";
			final String password = "1234";
			final String url = "jdbc:mysql://localhost:3306/javacore15";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, user, password);

			System.out.println("Connected success.");

			return conn;

		} catch (Exception e) {
			System.out.println("Connect error. " + e);
		} finally {
			System.out.println("Try catch complete.");
		}
		return null;
	}

	public static void main(String[] args) {
		JDBCConnection jdbcConnection = new JDBCConnection();

		Connection conn = jdbcConnection.getConnection();

	}
}
