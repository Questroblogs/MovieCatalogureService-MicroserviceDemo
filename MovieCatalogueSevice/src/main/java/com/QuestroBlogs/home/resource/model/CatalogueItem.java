package com.QuestroBlogs.home.resource.model;

public class CatalogueItem {
	
	String movieTitle;
	String desc;
	int rating;
	
	
	public CatalogueItem(String movieTitle, String desc, int rating) {
		super();
		this.movieTitle = movieTitle;
		this.desc = desc;
		this.rating = rating;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CatalogueItem [movieTitle=");
		builder.append(movieTitle);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
}
