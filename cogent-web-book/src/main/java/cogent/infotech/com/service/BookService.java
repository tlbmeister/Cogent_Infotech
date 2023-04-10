package cogent.infotech.com.service;

import java.util.List;

import cogent.infotech.com.entity.Book;

public interface BookService {

	Book saveBook(Book book);
	List<Book> fetchBookList();
	Book updateBook(Book book);
	void deleteBook(Book book);
}
