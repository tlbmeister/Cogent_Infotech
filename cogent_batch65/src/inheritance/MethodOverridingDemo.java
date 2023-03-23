package inheritance;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.setPersonName("John");
		
		p=new Parent();
		p.setPersonName("John");
		p.behavior();
		
		p=new Wife();
		p.setPersonName("John");
		p.behavior();
		
		p=new Children();
		p.setPersonName("John");
		p.behavior();
		
		p=new Colleague();
		
		p.setPersonName("John");
		p.behavior();
	}

}
