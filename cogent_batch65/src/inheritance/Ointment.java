package inheritance;

public class Ointment extends Medicine{
	public void displayLabel() {
		super.displayLabel();
		System.out.println("For external use only");
	}
}
