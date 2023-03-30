package collection;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLDemo {

	public static void main(String[] args) {

		List<String> list=new LinkedList<>();
		list.add("John");
		list.add("Amit");
		list.add("Shiva");
		list.add("Naresh");
		list.add("William");
		System.out.println("List is: "+list);
		
		ListIterator<String> itr=list.listIterator();
		System.out.println("Traversing the list in the forward direction: ");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing the list in the backward direction: ");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
