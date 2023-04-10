package cogent.infotech.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotch.com.repository.EmployeeRepository;
import cogent.infotech.com.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> fetchEmployee(){
		
		return (List<Employee>)employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
}
