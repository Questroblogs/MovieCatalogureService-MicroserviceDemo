package com.QuestroBlogs.home.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

import com.QuestroBlogs.home.resource.model.CatalogueItem;
import com.QuestroBlogs.home.resource.model.Movie;
import com.QuestroBlogs.home.resource.model.UserRatings;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalagueResource {
	
	//get all rated movie IDs
	@Autowired
	private RestTemplate restTemplate;
		// For each movie id call movie info service and get details
		// put them all together
//	@Autowired
//	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogueItem> getCatalogue(@PathVariable("userId") String userId){
		UserRatings ratings 
			= restTemplate
			.getForObject("http://localhost:8083/ratingdata/users/"+userId, 
					UserRatings.class);
		
		
		return ratings.getUserRating().stream().map(rating -> {
					Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getRating(), Movie.class);	
					return new CatalogueItem( movie.getName(), rating.getMovieId(),rating.getRating());
		}).collect(Collectors.toList());
		
//		return ratings.stream().map(rating -> {
//			Movie movie = webClientBuilder.build().get()
//			.uri("http://localhost:8082/movies/" + rating.getRating())
//			.retrieve()
//			.bodyToMono(Movie.class)
//			.block();
//			return new CatalogueItem( movie.getName(), rating.getMovieId(),rating.getRating());
//			}).collect(Collectors.toList());
	}
}
