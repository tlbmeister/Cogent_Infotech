package cogent.infotech.onetomanyrelationq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.onetomanyrelationq2.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
