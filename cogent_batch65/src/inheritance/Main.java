package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		Magazine m1=new Magazine();
		
		b1.setTitle("Hamlet");
		b1.setAuthor("William Shakespeare");
		b1.setPrice(5.95);
		
		m1.setTitle("Time");
		m1.setIssue("Feb. 2, 2023");
		m1.setPrice(0.58);
		
		b1.sell(3);
		m1.sell(53);
	}

}
