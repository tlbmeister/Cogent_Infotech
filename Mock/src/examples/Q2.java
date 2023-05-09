package examples;

import java.util.Arrays;

public class Q2 {
//Filters for factory pollution question May 9,2023
	public static void main(String[] args) {
		int[] arr= {5,19,8,1};
		int[] arr2= {10,10};
		int[] arr3= {3,0,5};
		System.out.println(numFilters(arr));
		System.out.println(numFilters(arr2));
		System.out.println(numFilters(arr3));

	}
	
	static int numFilters(int[] A) {
		int count=0;
		int totalPollution=0;
		for(int i=0;i<A.length;i++) {
			totalPollution+=A[i];
		}
		int goal=totalPollution/2;
		int newPollution=0;
		Arrays.sort(A);
		while(totalPollution>goal) {
			newPollution=0;
			A[A.length-1]=A[A.length-1]/2;
			count++;
			for(int i=0;i<A.length;i++) {
				newPollution+=A[i];
			}
			Arrays.sort(A);
			totalPollution=newPollution;
		}
		return count;
	}
}
