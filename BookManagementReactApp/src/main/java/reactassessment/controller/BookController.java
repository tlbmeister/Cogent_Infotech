package reactassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactassessment.entity.Book;
import reactassessment.repository.BookRepository;

@RestController
@CrossOrigin("*")
public class BookController {

	@Autowired
	BookRepository repo;
	
	@GetMapping("/getall")
	public List<Book> getAll(){
		return repo.findAll();
	}
	
	@PostMapping("/create")
	public Book addBook(@RequestBody @Validated Book book) {
		return repo.save(book);
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return repo.save(book);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		Book book=repo.getById(id);
		repo.delete(book);
	}
	
}
