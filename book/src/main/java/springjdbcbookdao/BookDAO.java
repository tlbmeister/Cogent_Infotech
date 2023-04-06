package springjdbcbookdao;


import java.util.List;

import springjdbcbookdto.Book;

public interface BookDAO {
	int create(Book book);
	int update(Book book);
	int delete(int id);
	Book read(int id);
	List<Book> read();
}
