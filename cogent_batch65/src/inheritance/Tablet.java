package inheritance;

public class Tablet extends Medicine{
	public void displayLabel() {
		super.displayLabel();
		System.out.println("store in a cool, dry place");
	}
}
