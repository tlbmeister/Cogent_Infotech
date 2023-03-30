package collection;
import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {

	public static void main(String[] args) {

		ArrayList<Student2> al=new ArrayList<>();
		
		Student2 s1=new Student2(1,"John");
		Student2 s2=new Student2(2,"Zoe");
		Student2 s3=new Student2(3,"Tiff");
		Student2 s4=new Student2(4,"Blake");
		Student2 s5=new Student2(5,"Alexis");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		System.out.println(al);
		
		Collections.sort(al,new StudentNameComparator());
		
		//al.sort(new StudentNameComparator());
		System.out.println(al);
	}

}
