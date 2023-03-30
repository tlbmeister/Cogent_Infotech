package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.Random;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Random obj=new Random();
		Set<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(500);
		set.add(200);
		set.add(140);
		set.add(30);
		set.add(1);
		set.add(140);
		
		System.out.println("Set is: "+set);
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
