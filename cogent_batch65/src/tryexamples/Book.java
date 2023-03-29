package tryexamples;

public class Book {
	
	int bookId;
	String bookName;
	int bookPrice;
	
	public Book() {
		
	}
	
	public Book(int id, String name, int price) {
		this.bookId=id;
		this.bookName=name;
		this.bookPrice=price;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
	

}
