package cogentbatch65autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;
	@Autowired
	private Reservation reservation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
}
