package com.ts.us.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.ts.us.dto.User;
import com.ts.us.exception.UrbanSpoonException;
import com.ts.us.utility.DAOUtility;

public class UserDAO {

	public User insert(User user) throws UrbanSpoonException {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			con = DAOUtility.getConn();
			String query1 = "insert into user(name, gender,email,password,mobile_number,dob) values(?,?,?,?,?,?)";
		//	String query2 = "select max(user_id) from user";
			pstmt = con.prepareStatement(query1);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getGender());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPwd());
			pstmt.setLong(5, user.getMblNum());
			pstmt.setDate(6, user.getDob());
			int no = pstmt.executeUpdate();
			if (no > 0) 
				System.out.println(no + ":Record is inserted..");
			else 
				System.out.println("**Some Problem");
			
			// get the primary key from db and set into User
		/*	stmt = con.createStatement();
			rs = stmt.executeQuery(query2);
			if (rs.next()) {
				user.setId(rs.getInt(1));
			} else {
				System.out.println("no data is there");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new UrbanSpoonException(e.toString());
		} finally {
			try {
				rs.close();
				stmt.close();
				pstmt.close();
				con.close();*/
			} catch (SQLException e) {
				throw new UrbanSpoonException(e.toString());
			}
		

		return user;
	}

	public User getUser(String email) throws UrbanSpoonException {

		return null;
	}

	public User getUser(int userId) throws UrbanSpoonException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			con = DAOUtility.getConn();
			String query = "select * from user where user_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setPwd(rs.getString(5));
				user.setDob(rs.getDate(6));
				user.setMblNum(rs.getLong(7));

			} else {
				System.out.println("No Record is there.....");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new UrbanSpoonException(e.toString());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return user;
	}
	
	public List<User> getAllUser() throws UrbanSpoonException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<User> listUser = new ArrayList<User>();
		String query = "select * from user";
		System.out.println("query is:" + query);

		try {
			con = DAOUtility.getConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {

				do {
					User user = new User();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setGender(rs.getString(3));
					user.setEmail(rs.getString(4));
					user.setPwd(rs.getString(5));
					user.setDob(rs.getDate(6));
					user.setMblNum(rs.getLong(7));
					listUser.add(user);
				} while (rs.next());

			} else {
				System.out.println("**No Record is there");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new UrbanSpoonException(e.toString());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listUser;
	}
}
