package inheritance;

public class SportsCar extends Car{
	
	String driver;
	
	
	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void AirBalloonType() {
		System.out.println("The speed is: "+this.speed);
		System.out.println("The number of gears is: "+this.noOfGear);
	}
	
	public void display() {
		this.AirBalloonType();
		System.out.println("The driver's name is: "+driver);
	}
}
