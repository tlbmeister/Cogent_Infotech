package cogent.infotech.com.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeePhone;
	
//	public Employee() {
//		
//	}
//
//	public Employee(Long employeeId, String employeeName, String employeeAddress, String employeePhone) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.employeeAddress = employeeAddress;
//		this.employeePhone = employeePhone;
//	}
//
//	public Long getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(Long employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//
//	public String getEmployeeAddress() {
//		return employeeAddress;
//	}
//
//	public void setEmployeeAddress(String employeeAddress) {
//		this.employeeAddress = employeeAddress;
//	}
//
//	public String getEmployeePhone() {
//		return employeePhone;
//	}
//
//	public void setEmployeePhone(String employeePhone) {
//		this.employeePhone = employeePhone;
//	}
	
	
}
