package tp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tp3.entities.Contrat;
import tp3.entities.Departement;

public interface contratRepo extends JpaRepository<Contrat, Long>{

}
