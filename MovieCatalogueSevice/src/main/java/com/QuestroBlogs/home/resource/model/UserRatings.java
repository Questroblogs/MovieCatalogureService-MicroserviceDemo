package com.QuestroBlogs.home.resource.model;

import java.util.List;

public class UserRatings {
	
	List<Rating> userRating;
	
	public UserRatings() {	
	}
	public UserRatings(List<Rating> userRating) {
		this.userRating = userRating;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

}
