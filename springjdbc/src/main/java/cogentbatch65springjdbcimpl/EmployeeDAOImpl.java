package cogentbatch65springjdbcimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import cogentbatch65springjdbcemployeedao.EmployeeDAO;
import cogentbatch65springjdbcemployeedtc.Employee;
import cogentbatch65springjdbcrowmapper.EmployeeRowMapper;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int create(Employee employee) {
		String sql="insert into employee values(?,?,?)";
		int result=jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}
	
	public int update(Employee employee) {
		String sql="update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getId());
		return result;
	}
	
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int result= jdbcTemplate.update(sql, id);
		return result;
	}
	
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper rowmapper= new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return employee;
	}
	
	public List<Employee> read(){
		String sql="select * from employee";
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}
	
	
}
