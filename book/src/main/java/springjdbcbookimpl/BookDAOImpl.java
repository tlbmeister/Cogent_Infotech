package springjdbcbookimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springjdbcbookdao.BookDAO;
import springjdbcbookdto.Book;
import springjdbcbookrowmapper.BookRowMapper;

@Component("bookDAO")
public class BookDAOImpl implements BookDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Book book) {

		String sql = "insert into book values(?,?,?)";
		int result =  jdbcTemplate.update(sql, book.getId(), book.getName(), book.getPrice());
		return result;
	}

	@Override
	public int update(Book book) {

		String sql = "update book set name=?,price=? where id=?";
		int result = jdbcTemplate.update(sql,book.getName(),book.getPrice(),book.getId());
		return result;
	}

	@Override
	public int delete(int id) {

		String sql="delete from book where id=?";
		int result=jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Book read(int id) {

		String sql = "select * from book where id=?";
		BookRowMapper rowmapper = new BookRowMapper();
		Book book= jdbcTemplate.queryForObject(sql, rowmapper, id);
		return book;
	}

	@Override
	public List<Book> read() {

		String sql = "select * from book";
		BookRowMapper rowmapper = new BookRowMapper();
		List<Book> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}
	
	

}
