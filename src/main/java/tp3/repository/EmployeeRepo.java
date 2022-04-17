package tp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp3.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	
	public Employee findByEmail(String email);

	public Employee findByEmailAndPassword(String email, String password);

	public void deleteEmployeeById(Long id);
}
