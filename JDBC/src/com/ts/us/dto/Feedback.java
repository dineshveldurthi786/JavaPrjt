package com.ts.us.dto;

import java.sql.Date;

public class Feedback {
	private int id;
	private Date feedbackDate;
	private Date visitingDate;
	private String comments;
	private int rating;
	private FeedbackType feedbackType ;
	private User user;
	private Branch branch;
	private Recipe recipe;
	
	
	
	public Feedback(){
		System.out.println("====="); 
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Date getFeedbackDate() {
		return feedbackDate;
	}



	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}



	public Date getVisitingDate() {
		return visitingDate;
	}



	public void setVisitingDate(Date visitingDate) {
		this.visitingDate = visitingDate;
	}



	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public FeedbackType getFeedbackType() {
		return feedbackType;
	}



	public void setFeedbackType(FeedbackType feedbackType) {
		this.feedbackType = feedbackType;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Branch getBranch() {
		return branch;
	}



	public void setBranch(Branch branch) {
		this.branch = branch;
	}



	public Recipe getRecipe() {
		return recipe;
	}



	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}



	@Override
	public String toString() {
		return "FeedBackDTO [id=" + id + ", feedbackDate=" + feedbackDate + ", visitingDate=" + visitingDate
				+ ", comments=" + comments + ", rating=" + rating + ", feedbackType=" + feedbackType + ", user=" + user
				+ ", branch=" + branch + ", recipe=" + recipe + "]";
	}



	

	
}
