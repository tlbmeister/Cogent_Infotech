package tryexamples;

public class Counter implements Runnable{
	boolean valueSet=false;
	Storage s;
	int item;
	
	public Counter(Storage s) {
		this.s=s;
		new Thread(this,"Counter").start();
	}
	
	

	public  void run() {
		int i = 0;
		while(true) {
			s.putItem(i++);
		}
	}
		
	
}
