package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//imp methods of ArrayList
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=10; i<=100; i=i+10) {
			list.add(i);
		}
		
		System.out.println("List is: "+list);
		
		list.add(2,100);
		System.out.println("List after insertion: "+list);
		
		list.set(3, 300);
		System.out.println("List after replacement: "+list);
		
		List<Integer> secondList=new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second list is: "+secondList);
		list.addAll(4,secondList);
		System.out.println("List after adding new list: "+list);
		
		if(list.contains(222)) {
			System.out.println("List has the value");
		}else {
			System.out.println("List does not contain the value");
		}
		
		list.remove(3);
		System.out.println("List after deletion: "+list);
	}

}
