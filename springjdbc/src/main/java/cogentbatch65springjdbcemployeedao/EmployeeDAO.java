package cogentbatch65springjdbcemployeedao;

import java.util.List;

import cogentbatch65springjdbcemployeedtc.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();
}
