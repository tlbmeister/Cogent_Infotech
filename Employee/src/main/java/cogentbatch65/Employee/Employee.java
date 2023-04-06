package cogentbatch65.Employee;

public class Employee {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void init() {
		System.out.println("Hi");
	}
	
	public void destroy() {
		System.out.println("Bye");
	}

}
