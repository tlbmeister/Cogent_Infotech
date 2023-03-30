package tryexamples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("Tech", "Cogent","Infotech", "Tutorial","Tom", "Tina","Amit");
		Predicate<String> p=(s)->s.startsWith("T");
		
		for(String st:names) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}
		
	}

}
