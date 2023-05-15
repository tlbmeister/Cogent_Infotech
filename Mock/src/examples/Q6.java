package examples;

import java.util.Arrays;

public class Q6 {
//write a program to return unique elements from an array ex:[12,15,17,19,12,12] -> [12,15,17,19]
	public static void main(String[] args) {

		int[] test= {12,15,17,19,12,12};
		System.out.println(Arrays.toString(uniqueElements(test)));
	}
	
	static int[] uniqueElements(int[] input) {
		int count =0;
		for(int i=0;i<input.length-1;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]==input[j]) {
					input[j]=-1;
				}
			}
		}
		for(int i=0;i<input.length;i++) {
			if(input[i]!=-1) {
				count++;
			}
		}
		int[] arr=new int[count];
		int index=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=-1) {
				arr[index]=input[i];
				index++;
			}
		}
		return arr;
	}

}
