package com.ts.us.dto;

import java.util.List;

public class Restaurant {
private int id;
private String govid;
private String name;
private String pwd;
private String logoName;
private List<Branch> branchList;


public  Restaurant(){
	System.out.println("======");
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGovid() {
	return govid;
}
public void setGovid(String govid) {
	this.govid = govid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getLogoName() {
	return logoName;
}
public void setLogoName(String logoName) {
	this.logoName = logoName;
}


public List<Branch> getBranchList() {
	return branchList;
}

public void setBranchList(List<Branch> branchList) {
	this.branchList = branchList;
}

@Override
public String toString() {
	return "Restaurent [id=" + id + ", govid=" + govid + ", name=" + name + ", pwd=" + pwd + ", logoName=" + logoName
			+ ", branchList=" + branchList + "]";
}



}
