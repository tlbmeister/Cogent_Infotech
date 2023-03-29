package Multithreading;

public class MyThreads extends Thread{
	DisplayMessage dm;
	String name;
	public MyThreads(DisplayMessage dm,String name) {
		this.dm=dm;
		this.name=name;
	}
	
	public void run() {
		dm.sayHello(name);
	}
}
