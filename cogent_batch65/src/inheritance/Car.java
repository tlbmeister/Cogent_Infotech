package inheritance;

public class Car {

		int speed;
		int noOfGear;
		
		
		
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public int getNoOfGear() {
			return noOfGear;
		}

		public void setNoOfGear(int noOfGear) {
			this.noOfGear = noOfGear;
		}

		public void drive(int speed, int noOfGear) {
			this.speed=speed;
			this.noOfGear=noOfGear;
		}
		
		public void display() {
			System.out.println("This car has a speed of: "+speed);
			System.out.println("This car has "+noOfGear+" gears.");
		}
}
