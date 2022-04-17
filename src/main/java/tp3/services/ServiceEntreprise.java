package tp3.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tp3.entities.Departement;
import tp3.entities.Entreprise;
import tp3.repository.EntrepriseRepo;


@Service
public class ServiceEntreprise {
	 @Autowired
    private  EntrepriseRepo entrepriseRepo ;
    
   
    public ServiceEntreprise(EntrepriseRepo entrepriseRepo) {
        this.entrepriseRepo = entrepriseRepo;
    }
	
    public Entreprise getEntrepriseById(Long id)   
    {  
    return entrepriseRepo.findById(id).get();  
    }  
    
    
    public void deleteEntreprise(Long id)   
    {  
    	entrepriseRepo.deleteById(id);  
    }

	public Entreprise addEntreprise(Entreprise entreprise) {
		
		return entrepriseRepo.save(entreprise);
	}

	public Departement addDepartement(Departement departement) {
		
		return entrepriseRepo.save(departement);
	}

	public void deleteDepartementById(Long depId) {
		entrepriseRepo.deleteById(depId);  
		
	}

	
	
	
	  
	
	

}
