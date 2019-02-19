package com.QuestroBlogs.home.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRatings getUserRating(@PathVariable("userId") String userID) {
		List<Rating> rating =  Arrays.asList(
				new Rating("123",4),
				new Rating("124",3),
				new Rating("125",5)
				);
		
		return new UserRatings(rating);
	}

}
