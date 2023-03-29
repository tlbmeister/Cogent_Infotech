package Multithreading;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		DisplayMessage dm=new DisplayMessage();
		MyThreads t1=new MyThreads(dm,"Steve");
		MyThreads t2=new MyThreads(dm,"Mark");
		t1.start();
		t2.start();
	}

}
