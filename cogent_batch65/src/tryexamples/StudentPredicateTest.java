package tryexamples;
import java.util.function.Predicate;
import java.util.ArrayList;

public class StudentPredicateTest {

	public static void main(String[] args) {

		Student2 s1=new Student2(1,4,"John");
		Student2 s2=new Student2(2,5,"Tom");
		ArrayList<Student2> al=new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		
		Predicate<Student2> p=(x)->x.getRollNo()==2;
		for(Student2 s:al) {
			if(p.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		
	}

}
