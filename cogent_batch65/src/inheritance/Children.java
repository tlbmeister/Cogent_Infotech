package inheritance;

public class Children extends Person{
	public void behavior() {
		System.out.println(this.getPersonName()+" exhibits Care towards children");
	}
}
