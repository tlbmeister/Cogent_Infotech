package inheritance;

public class Syrup extends Medicine{
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Take as subscribed");
	}
}
