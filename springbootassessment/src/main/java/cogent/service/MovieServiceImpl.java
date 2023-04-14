package cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cogent.entity.Movie;
import cogent.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository repo;

	@Override
	public Movie saveMovie(Movie movie) {

		return repo.save(movie);
	}

	@Override
	public List<Movie> fetchMovieList() {
		return (List<Movie>) repo.findAll();
	}
	
	public Optional<Movie> get(int id){
		  return repo.findById(id);
	  }
	
	public Movie update(Movie movie) {
		  return repo.save(movie);
	  }
	
	public void delete(Movie movie) {
		  repo.delete(movie);
	  }

}
