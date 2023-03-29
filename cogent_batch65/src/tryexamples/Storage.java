package tryexamples;

public class Storage {

	int stored;
	boolean valueSet=false;
	
	public Storage() {
		
	}
	public Storage(int s) {
		this.stored=s;
	}
	
	synchronized int getItem()

	{
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Printed: " + stored);
		valueSet = false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
		return stored;
	}
	
	synchronized void putItem(int stored) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.stored = stored;
		valueSet = true;
		System.out.println("Stored: " + stored);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
	}
}
