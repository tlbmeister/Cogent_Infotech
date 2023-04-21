package cogentbatch65;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogentbatch65.entity.Book;
import cogentbatch65.repository.BookRepository;

@SpringBootApplication()
public class SpringbootBookBackendAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBookBackendAppApplication.class, args);
	}
	
	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {

		this.repo.save(new Book("java",20));
		this.repo.save(new Book("cpp",30));
	}
	
	

}
