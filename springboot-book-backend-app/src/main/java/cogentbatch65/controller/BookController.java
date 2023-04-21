package cogentbatch65.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogentbatch65.entity.Book;
import cogentbatch65.repository.BookRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/")
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@GetMapping("book")
	public List<Book> getBooks(){
		return this.repo.findAll();
	}
}
