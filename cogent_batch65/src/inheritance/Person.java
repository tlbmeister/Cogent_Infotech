package inheritance;

public class Person {
	String personName;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public void behavior() {
		System.out.println("Idle");
	}
}
