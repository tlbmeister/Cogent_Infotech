package cogent_batch65;

public class CalcAverage {
	
	public double avgFirstN(int N) {
		if(N<= 0) {
			throw new IllegalArgumentException();
		}else {
			double a=0;
			for(int i=1;i<=N;i++) {
				a+=i;
			}
			return a/N;
		}
		
	}
	
	public static void main(String args[]) {
		CalcAverage c=new CalcAverage();
		try {
		double d= c.avgFirstN(6);
		System.out.println(d);
		}catch(IllegalArgumentException e) {
			System.out.println("This is not a natural number");
		}
	}

}
