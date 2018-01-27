package com.ts.us.dto;

import java.util.List;

public class Recipe {
private int id;
private String name;
private String description;
private int isVeg;
private float price;
private String image;
private List<Feedback> feedbackList;



public Recipe(){
	System.out.println("Recipe object is created");
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





public String getDescription() {
	return description;
}





public void setDescription(String description) {
	this.description = description;
}





public int getIsVeg() {
	return isVeg;
}





public void setIsVeg(int isVeg) {
	this.isVeg = isVeg;
}


@Override
public String toString() {
	return "RecipeDTO [id=" + id + ", name=" + name + ", description=" + description + ", isVeg=" + isVeg + ", price="
			+ price + ", image=" + image + ", feedbackList=" + feedbackList + "]";
}







}
