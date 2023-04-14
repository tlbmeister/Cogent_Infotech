package cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.entity.Movie;
import cogent.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/movies")
	public Movie saveMovie(@Validated @RequestBody Movie movie) {
		return service.saveMovie(movie);
	}
	
	@GetMapping("/movies")
	public List<Movie> fetchMovieList(){
		return service.fetchMovieList();
	}
}
