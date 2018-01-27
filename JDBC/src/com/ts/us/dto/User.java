package com.ts.us.dto;

import java.sql.*;

public class User {
private int id;
private String name;
private String gender;
private String email;
private String pwd;
private long MblNum;
private java.sql.Date dob;

public User(){
	System.out.println("UserDTO object has created");
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public long getMblNum() {
	return MblNum;
}

public void setMblNum(long mblNum) {
	MblNum = mblNum;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

@Override
public String toString() {
	return "UserDTO [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", pwd=" + pwd
			+ ", MblNum=" + MblNum + ", dob=" + dob + "]";
}




}
