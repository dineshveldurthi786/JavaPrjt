package com.ts.us.dto;

import java.util.List;

public class Cuisine {
	private int id;
	private String name;
	private String country;
	private List<Recipe>  recpieList;
	
	
	
	public Cuisine(){
		System.out.println("cusine obj created ");
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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	


	public List<Recipe> getRecpieList() {
		return recpieList;
	}


	public void setRecpieList(List<Recipe> recpieList) {
		this.recpieList = recpieList;
	}


	@Override
	public String toString() {
		return "CusineDTO [id=" + id + ", name=" + name + ", country=" + country + ", recpieList=" + recpieList + "]";
	}
	
	
}
