package com.kodnest.jdbc;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
public class ProjectConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("JDBC");

		

		//loading the Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		

		

		String url="jdbc:mysql://localhost/kodnest";

		String username="root";

		String password="Prixy@123";

		

		Connection connection=DriverManager.getConnection(url,username,password);

		

		System.out.println(connection + "connection success");

		

	}



}


