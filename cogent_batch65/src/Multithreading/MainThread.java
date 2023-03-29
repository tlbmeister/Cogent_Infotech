package Multithreading;

public class MainThread {

	public static void main(String[] args) {

		MyThread2 t=new MyThread2();
		t.start();
		synchronized(t) {
			try {
				System.out.println("Main thread is going to wait");
				t.wait();
				System.out.println("Main thread notified");
				System.out.println(t.total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
