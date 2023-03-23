package cogent_batch65;

import java.util.Arrays;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum=0;
		int avg=0;
		int small=A[0];
		
		for(int i=0;i<14;i++) {
			sum+=A[i];
		}
		A[15]=sum;
		
		avg=sum/15;
		A[16]=avg;
		
		for(int i=0;i<14;i++) {
			if(A[i]<small) {
				small=A[i];
			}
		}
		A[17]=small;
		System.out.println(Arrays.toString(A));
//		for(int i=0;i<A.length;i++) {
//			System.out.println(A[i]);
//		}
	}

}
