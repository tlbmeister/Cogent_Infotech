package cogent.service;

import java.util.List;

import cogent.entity.Movie;

public interface MovieService{

	Movie saveMovie(Movie movie);
	
	List<Movie> fetchMovieList();
}
