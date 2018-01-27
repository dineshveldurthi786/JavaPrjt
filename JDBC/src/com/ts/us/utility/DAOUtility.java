package com.ts.us.utility;

import java.sql.*;

public class DAOUtility {

	public static void main(String[] args) throws SQLException {
	 Connection con=null;
		Statement stat = con.createStatement();
		String query="insert into user values(1,'santhosh','male','santhu@gmail.com','d57f8s9',9089343)";
        stat.executeUpdate(query);
        
        con.close();
	}

	public static Connection getConn() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		System.out.println("registered with driver");
		String url= "jdbc:mysql://localhost:3306/urbanspoon";
		String uname="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(url, uname, pwd);
		System.out.println("connection is created");
		return con;
	}

}