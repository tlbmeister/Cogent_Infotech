package assessment2;

import java.util.ArrayList;

public interface EmployeeDAO {
	
	public Employee create();
	public ArrayList<Employee> update(ArrayList<Employee> al);
	public ArrayList<Employee> delete(ArrayList<Employee> al);
	public void read(Employee e);
	public Employee search(ArrayList<Employee> al);
	public ArrayList<Employee> sort(ArrayList<Employee> al);

}
