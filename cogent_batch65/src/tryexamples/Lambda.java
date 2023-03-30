package tryexamples;

interface MyInterface{
	int lengthOfString(String s);
}

public class Lambda {

	public static void main(String[] args) {

		MyInterface mi=(String s)->{return s.length();};
		System.out.println(mi.lengthOfString("String"));
		
		
	}

}
