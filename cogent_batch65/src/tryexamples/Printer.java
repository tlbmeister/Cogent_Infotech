package tryexamples;

public class Printer extends Thread{
	
	Storage s;
	
	public Printer(Storage s) {
		this.s=s;
		new Thread(this,"Printer").start();
	}
	
	public  void run() {
		while(true) {
			s.getItem();
		}
	}

}
