package reactassessment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactassessment.entity.Book;
import reactassessment.repository.BookRepository;

@SpringBootApplication
public class BookManagementReactAppApplication {
	@Autowired
	BookRepository repo;


	public static void main(String[] args) {
		SpringApplication.run(BookManagementReactAppApplication.class, args);
	}
	
	@PostConstruct
    public void initUsers() {
        List<Book> books = Stream.of(
                new Book("1984", 19.99),
                new Book("To Kill a Mockingbird", 24.99),
                new Book("Wuthering Heights", 14.99),
                new Book("The Catcher in the Rye", 19.99),
                new Book("Farenheit 451", 17.99)
        ).collect(Collectors.toList());
        repo.saveAll(books);
	}

}
