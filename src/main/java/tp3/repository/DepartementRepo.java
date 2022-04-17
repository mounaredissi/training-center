package tp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tp3.entities.Departement;
import tp3.entities.Employee;

public interface DepartementRepo extends JpaRepository<Departement, Long>{

}
