package com.QuestroBlogs.home.resources;

import java.util.List;

public class UserRatings {
	
	List<Rating> userRating;
	
	public UserRatings(List<Rating> userRating) {
		super();
		this.userRating = userRating;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

}
