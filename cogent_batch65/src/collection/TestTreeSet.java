package collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("aloe");
		ts.add("milk");
		ts.add("chips");
		ts.add("butter");
		ts.add("milk");
		
		Iterator<String> itr=ts.iterator();
		System.out.println("Iterating set: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("First of set: "+ts.first());
		System.out.println("Last of set: "+ts.last());
		System.out.println("Size of set: "+ts.size());
		ts.remove("milk");
		System.out.println("Size after deletion: "+ts.size());
		
		
	}

}
