package za.ac.cput.Repository;

import za.ac.cput.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employees, Long> {

}
