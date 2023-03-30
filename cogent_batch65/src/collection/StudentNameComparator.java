package collection;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student2>{
	
	public int compare(Student2 a, Student2 b) {
		return a.compareTo(b);
	}

}
