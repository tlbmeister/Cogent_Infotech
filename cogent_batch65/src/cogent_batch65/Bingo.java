package cogent_batch65;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==2) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int[] arr= {5,24,36,38,39};
			System.out.println("Your first number was "+a);
			System.out.println("Your second number was "+b);
			for(int i=0;i<arr.length;i++) {
				if(a==arr[i]||b==arr[i]) {
					System.out.println("Bingo");
					return;
				}
			}
			System.out.println("Sorry, the array was: "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			
			
		}else {
			System.out.println("Please enter two numbers.");
		}
	}
}
