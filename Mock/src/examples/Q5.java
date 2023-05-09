package examples;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
//given a string, split into minimal substrings so that no letter occurs more than once. May 9, 2023
	public static void main(String[] args) {

		System.out.println(solution("abacdec"));
		System.out.println(solution("dddd"));		
		System.out.println(solution("cycle"));
		System.out.println(solution("wrote"));
	}
	
	public static int solution(String s) {
		char[] c=s.toCharArray();
		int count=1;
		List<Character> temp=new ArrayList<>();
		for(int i=0;i<c.length;i++) {
			if(!temp.contains(c[i])) {
				temp.add(c[i]);
			}else {
				count++;
				temp=new ArrayList<>();
				temp.add(c[i]);
			}
		}
		return count;
	}

}
