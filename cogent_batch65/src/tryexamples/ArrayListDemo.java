package tryexamples;

public class ArrayListDemo {

	public static void main(String[] args) {

		Student s=new Student();
		s.setNames();
		s.printNames();
		s.removeName("joe");
		s.printNames();
		s.searchName(0);
		s.searchName("sue");
		
		
	}

}
