package cogent.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
