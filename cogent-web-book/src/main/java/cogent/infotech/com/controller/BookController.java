package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping("/book")
	public List<Book> fetchBooks(){
		return bookService.fetchBookList();
	}
	
	@PutMapping("/book")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/book")
	public void deleteBook(@RequestBody Book book) {
		bookService.deleteBook(book);
	}
	
}
