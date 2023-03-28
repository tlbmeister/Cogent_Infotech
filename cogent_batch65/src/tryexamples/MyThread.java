package tryexamples;

public class MyThread extends Thread{
	
	public MyThread() {
		
	}
	
	public void run() {
		System.out.println("The thread has started: "+Thread.currentThread().getName());
	}

}
