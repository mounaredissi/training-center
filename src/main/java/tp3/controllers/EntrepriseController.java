package tp3.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tp3.entities.Departement;
import tp3.entities.Entreprise;
import tp3.services.ServiceEntreprise;




@Controller
public class EntrepriseController {
	
	@Autowired
private  ServiceEntreprise servicentreprise;
    
    public EntrepriseController(ServiceEntreprise servicentreprise) {
		
		this.servicentreprise = servicentreprise;
	}
    
    @PostMapping("/add")
    public Entreprise addEntreprise(@RequestBody Entreprise entreprise){

       entreprise  = servicentreprise.addEntreprise(entreprise);
        return entreprise;
    }
    
    @PostMapping("/add/departement")
    public Departement addDepartement(@RequestBody Departement departement){

    	departement = servicentreprise.addDepartement(departement);
        return departement;
    }
    
    @GetMapping("/Entreprise/{entrepriseid}")  
    private Entreprise getEntreprise( Long id)   
    {  
    return servicentreprise.getEntrepriseById(id);  
    } 
    
  
    
    @DeleteMapping("/entreprise/{id}")  
	private void deleteById(@PathVariable("id") Long id)   
	{  
    	servicentreprise.deleteEntreprise(id);  
	}
    
    @DeleteMapping("/entreprise/departement/{depId}")  
   	private void deleteDepartementById(@PathVariable("depId") Long depId)   
   	{  
       	servicentreprise.deleteDepartementById(depId);  
   	}
    
    
		
    
    

}
