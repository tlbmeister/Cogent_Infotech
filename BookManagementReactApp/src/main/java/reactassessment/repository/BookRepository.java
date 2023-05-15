package reactassessment.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import reactassessment.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
