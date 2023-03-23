package gl.itp.hyd65.cs65.Travis;

public class Greeter {
	String name;
	
	public Greeter(String aName) {
		this.name=aName;
	}
	
	public String sayHello() {
		return "Hello "+name;
	}
	
	public String sayGoodbye() {
		return "Goodbye "+name;
	}

}
