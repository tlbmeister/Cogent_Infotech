package cogent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
