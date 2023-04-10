package cogent.infotech.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepo;

	@Override
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> fetchBookList() {
		return (List<Book>) bookRepo.findAll();
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		bookRepo.delete(book);
	}
	
	

}
