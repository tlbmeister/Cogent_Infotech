package cogent_batch65;
import java.util.Scanner;

public class PersonDAO {
	
	Scanner sc=new Scanner(System.in);
	public void create(Person[] person, int i) {
		Person p=new Person();
		person[i]=p;
		System.out.println("Please enter the person id: ");
		person[i].setPersonId(sc.nextInt());
		System.out.println("Please enter the person name: ");
		person[i].setPersonName(sc.next());
		System.out.println("Please enter the person address: ");
		person[i].setPersonAddress(sc.next());
	}
	
	public void read(Person[] person) {
		for(Person p:person) {
			System.out.println("Person ID is: "+p.getPersonId());
			System.out.println("Person name is: "+p.getPersonName());
			System.out.println("Person address is: "+p.getPersonAddress());
		}
		
		//System.out.println(person.toString());
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
