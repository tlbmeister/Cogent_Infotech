package tryexamples;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread mt=new MyThread();
		MyThread mt2=new MyThread();
		
		mt.setName("First");
		mt2.setName("Second");
		mt.setPriority(1);
		mt2.setPriority(10);
		mt.start();
		mt2.start();
		
		
	}

}
