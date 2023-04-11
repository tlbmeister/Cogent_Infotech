package cogent.infotech.onetomanyrelationq2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String course_name;
	private int course_fee;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_fee() {
		return course_fee;
	}
	public void setCourse_fee(int course_fee) {
		this.course_fee = course_fee;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String course_name, int course_fee) {
		super();
		this.course_name = course_name;
		this.course_fee = course_fee;
	}
	
	
	
	
}
