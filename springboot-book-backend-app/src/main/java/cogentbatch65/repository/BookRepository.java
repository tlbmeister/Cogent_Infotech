package cogentbatch65.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogentbatch65.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
