package cogent.infotech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String expiry;
	@OneToOne(mappedBy="employee")
	private Employee employee;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public Passport(long id, String expiry) {
		super();
		this.id = id;
		this.expiry = expiry;
	}
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
