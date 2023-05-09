package examples;

public class Q4 {
//Stay positive...  find a start value where adding elements to that value will always result in a positive number May 9, 2023
	public static void main(String[] args) {

		int[] arr= {-4,3,2,1};
		int[] arr2= {3,-6,5,-2,1};
		int[] arr3= {5};
		System.out.println(minStart(arr));
		System.out.println(minStart(arr2));
		System.out.println(minStart(arr3));

	}
	
	static long minStart(int[] arr) {
		int start=0;
		int loop=0;
		for(int i=1;i<100;i++) {
			start=i;
			loop=0;
			for(int j=0;j<arr.length;j++) {
				start+=arr[j];
				if(start>0) {
					loop++;
					continue;
				}else {
					break;
				}
				
			}
			if(loop==arr.length) {
				return i;
			}
		}
		return start;
	}

}
