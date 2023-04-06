package cogentbatch65autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	Car car;

	public Car getCar() {
		return car;
	}
@Autowired
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
