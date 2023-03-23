package inheritance;

public class CarDemo {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.drive(55, 4);
		c.display();
		
		SportsCar car=new SportsCar();
		car.drive(85, 6);
		car.setDriver("John");
		car.display();
	}

}
