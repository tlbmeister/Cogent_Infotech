package springjdbcbookrowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springjdbcbookdto.Book;

public class BookRowMapper implements RowMapper<Book>{

	public Book mapRow(ResultSet rs, int rowNum) throws SQLException{
		Book book=new Book();
		book.setId(rs.getInt("id"));
		book.setName(rs.getString("name"));
		book.setPrice(rs.getInt("price"));
		return book;
	}
}
