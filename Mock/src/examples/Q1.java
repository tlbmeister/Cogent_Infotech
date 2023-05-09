package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
//Autocorrect prototype May 9, 2023
	public static void main(String[] args) {
		String[] a={"duel","speed","dule","cars"};
		String[] b={"spede","deul"};

		List<String[]> results=new ArrayList<>();
		results=getSearchResults(a,b);
		System.out.println(Arrays.toString(results.get(0)));
		System.out.println(Arrays.toString(results.get(1)));
	}
	
	static List<String[]> getSearchResults(String words[], String queries[]){
		List<String[]> anagrams=new ArrayList<>();
		String[] sortedStrings=new String[words.length];
		for(int i=0;i<words.length;i++) {
			sortedStrings[i]=words[i];
		}
		//changes the words into sorted strings to be used for comparison
		for(int i=0;i<sortedStrings.length;i++) {
			char[] wordArray=sortedStrings[i].toCharArray();
			Arrays.sort(wordArray);
			sortedStrings[i]=new String(wordArray);

			
		}
		//change queries into sorted strings to be used for comparison
		for(int i=0;i<queries.length;i++) {
			char[] queryArray=queries[i].toCharArray();
			Arrays.sort(queryArray);
			String query=new String(queryArray);
			queries[i]=query;
		}
		//compare the strings and add words to anagrams
		for(int i=0;i<queries.length;i++) {
			List<String> matches=new ArrayList<>();
			for(int j=0;j<sortedStrings.length;j++) {
				if(queries[i].equals(sortedStrings[j])) {
					//System.out.println(words.toString());
					matches.add(words[j]);
					//System.out.println(matches);
				}
		
			}
			String[] temp=new String[matches.size()]; 
			matches.toArray(temp);
			//System.out.println(temp);
			anagrams.add(temp);
		}
		return anagrams;
	}

}
