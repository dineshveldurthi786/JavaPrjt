package com.ts.us.dto;

import java.util.List;

public class Branch {
private int id;
private String location;
private String city;
private String state;
private String country;
private int postCode;
private List<String> imagelist;
private List<Cuisine> cusineList;
private List<Feedback> feedbackList;



public Branch(){
	
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getLocation() {
	return location;
}



public void setLocation(String location) {
	this.location = location;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getState() {
	return state;
}



public void setState(String state) {
	this.state = state;
}



public String getCountry() {
	return country;
}



public void setCountry(String country) {
	this.country = country;
}



public int getPostCode() {
	return postCode;
}



public void setPostCode(int postCode) {
	this.postCode = postCode;
}



public List<String> getImagelist() {
	return imagelist;
}



public void setImagelist(List<String> imagelist) {
	this.imagelist = imagelist;
}



public List<Cuisine> getCusineList() {
	return cusineList;
}



public void setCusineList(List<Cuisine> cusineList) {
	this.cusineList = cusineList;
}



public List<Feedback> getFeedbackList() {
	return feedbackList;
}



public void setFeedbackList(List<Feedback> feedbackList) {
	this.feedbackList = feedbackList;
}



@Override
public String toString() {
	return "Branch [id=" + id + ", location=" + location + ", city=" + city + ", state=" + state + ", country="
			+ country + ", postCode=" + postCode + ", imagelist=" + imagelist + ", cusineList=" + cusineList
			+ ", feedbackList=" + feedbackList + "]";
}





}
