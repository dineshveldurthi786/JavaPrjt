package com.ts.us.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.ts.us.dto.Branch;
import com.ts.us.exception.UrbanSpoonException;
import com.ts.us.utility.DAOUtility;


 public class BranchDAO {
	 Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		con = DAOUtility.getConn();
	public Branch insert(long restaurantId, Branch branch) throws UrbanSpoonException {
		
		String query1 = "insert into branch(location,city,state,country,postal_code) values(?,?,?,?,?)";
		String query2 = "select max(user_id) from user";
		pstmt = con.prepareStatement(query1);
		pstmt.setString(1, branch.getLocation());
		pstmt.setString(2, branch.getCity());
		pstmt.setString(3,branch.getState() );
		pstmt.setString(4,branch.getCountry());
		pstmt.setLong(5, branch.getPostCode());
         if(pstmt.executeUpdate()>0){
        	 System.out.println("Record is inserted");
        	 
         } else {
				System.out.println("**Some Problem");
			}
		
		
		
		return branch;
	}

	
	public Branch getBranch(int branchId, boolean includeCuisines) throws UrbanSpoonException {
		
			String query = "select * from user where branch_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, branchId);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Branch br = new Branch();
				br.setLocation(rs.getString(1));
				br.setCity(rs.getString(2));
				br.setCountry(rs.getString(3));
				br.setState(rs.getString(4));
				br.setPostCode(rs.getInt(5));
			}else {
				System.out.println("No Record is there.....");
			}
		return rs;
	}

	public List<Branch> getBranches(long restaurantId, boolean includeCuisines,boolean includeFeedbacks) throws UrbanSpoonException {

		return null;
	}


	
	public boolean addImage(long branchId, String fileName) throws UrbanSpoonException {

		return false;
	}

	public List<String> getBranchImages(int branchId) throws UrbanSpoonException {

		return null;
	}

}
