package tryexamples;
import java.util.ArrayList;

public class Student {
	
	private ArrayList<String> names=new ArrayList<>();
	

	
	
	public void setNames() {
		this.names.add("john");
		this.names.add("joe");
		this.names.add("ann");
		this.names.add("sue");
		this.names.add("nancy");
		
	}
	
	public void searchName(String name) {
		if(this.names.contains(name)) {
			System.out.println("The list contains: "+name);
		}else {
			System.out.println("The list does not contain: "+name);
		}
	}
	
	public void searchName(int index) {
		System.out.println("The name at index "+index+" is: "+this.names.get(index));
	}
	
	public void printNames() {
		System.out.println("Printing names: ");
		for(String str:this.names) {
			
			System.out.println(str);
		}
	}
	
	public void removeName(String stuName) {
		this.names.remove(stuName);
	}

}
