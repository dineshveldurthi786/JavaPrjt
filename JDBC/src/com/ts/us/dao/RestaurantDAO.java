package com.ts.us.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.ts.us.dto.Restaurant;
import com.ts.us.exception.UrbanSpoonException;
import com.ts.us.exception.UrbanspoonException;
import com.ts.us.utility.DAOUtility;



//G1(Restaurant)  and G2(Branch)

public class RestaurantDAO {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	public List<Restaurant> getRestaurants(boolean includeBranches) throws UrbanSpoonException, SQLException {
		
		String query = "select * from restaurant";
		System.out.println("query is "+query);
		con = DAOUtility.getConn();
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
            if(rs.next()){
            	do{
            		Restaurant r = new Restaurant();
            		r.setId(rs.getInt(1));
            		r.setGovid(rs.getString(2));
            		r.setName(rs.getString(3));
            		r.setPwd(rs.getString(4));
            		r.setLogoName(rs.getString(5));
            		if(includeBranches){
            			
                  }
            	}while(rs.next());

		
	}return List<Restautant>;
            }

	public Restaurant getRestaurant(int restaurantId, boolean includeBranches) throws UrbanSpoonException {
		
		String query = "select * from restaurant where id=?";
		System.out.println("query is "+query);
		con = DAOUtility.getConn();
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
            if(rs.next())
            	
		
            		
            		
            		
            		
		return rs;
	}
            

	public Restaurant insert(Restaurant restaurant) throws UrbanSpoonException {

		
		
		return null;
	}

	public Restaurant getRestaurant(String govtRegistrationId, boolean includeBranches) throws UrbanSpoonException {
	
		
		
		return null;
	}

	public boolean updateLogoAddress(int restaurantId, String fileName) throws UrbanSpoonException {
		
		
		
		return false;
	}

}
