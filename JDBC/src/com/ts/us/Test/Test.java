package com.ts.us.Test;

import java.sql.Date;
import java.sql.SQLException;

import com.ts.us.dao.UserDAO;
import com.ts.us.dto.User;
import com.ts.us.exception.UrbanSpoonException;

public class Test {

	public static void main(String[] args) throws SQLException {
   UserDAO doa = new UserDAO();
		String uname ="Dineshh";
          String gender="m";
          String email = "dinuu@gmail.com";
          String password = "d7iu8n6u";
          long mno=90141898;
          String dob="1995-06-29";
          int id =7;
          User user = new User();
          user.setName(uname);
          user.setGender(gender);
          user.setEmail(email);
          user.setPwd(password);
          user.setMblNum(mno);
          user.setDob(java.sql.Date.valueOf(dob));
          user.setId(id);
          
          try {
			user=doa.insert(user);
		} catch (UrbanSpoonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(user);
          
          
          
	}

}
