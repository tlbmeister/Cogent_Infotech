package cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@DeleteMapping("/movies")
	public String delete(@RequestParam(value="id") Integer id) {
		Optional<Movie> i = service.get(id);
		service.delete(i.get());
		return "Item id "+id+" deleted successfully";
	}
	
	@PutMapping("/items")
	public Movie edit(@RequestBody Movie movie) {
		return service.update(movie);
	}
}
