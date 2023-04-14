package cogent.service;

import java.util.List;
import java.util.Optional;

import cogent.entity.Movie;

public interface MovieService{

	Movie saveMovie(Movie movie);
	
	List<Movie> fetchMovieList();
	
	Optional<Movie> get(int id);
	
	Movie update(Movie movie);
	
	void delete(Movie movie);
}
