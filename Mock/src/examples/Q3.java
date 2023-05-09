package examples;

import java.util.Arrays;

public class Q3 {
//print a number which is largest in a row and smallest in a column
	public static void main(String[] args) {

		int[][] arr= {{1,2,3,6,5},
					  {3,2,5,6,7},
					  {5,6,7,8,9},
					  {1,3,0,2,4}};
		int[][] arr2= {{2,2},
				{1,2},{3,4}};
		int[][] arr3= {{1,2,3,5},{2,3,8,8},{3,8,3,2}};
		System.out.println(result(arr));
		System.out.println(result(arr2));
		System.out.println(result(arr3));



	}
	
	static int result(int[][] input) {
		int num=Arrays.stream(input).mapToInt(row->Arrays.stream(row).max().orElse(-1)).min().orElse(-1);
		return num;
	}

}
