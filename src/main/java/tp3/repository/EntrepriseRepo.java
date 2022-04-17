package tp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tp3.entities.Departement;
import tp3.entities.Entreprise;


public interface EntrepriseRepo extends JpaRepository<Entreprise, Long> {

	
	public Entreprise findByID(String id_Ent);

	public Departement save(Departement departement);

}
