package tp3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tp3.entities.Employee;
import tp3.services.ServiceEmploye;




@Controller
public class EmployeController {
	
    private final  ServiceEmploye serviceEmploye;
    @Autowired
	
    public EmployeController(ServiceEmploye serviceEmploye) {
		
		this.serviceEmploye = serviceEmploye;
	}
    
    @PostMapping("/login")
	public Employee authenticate (@RequestBody Employee employe) throws Exception {
		
    	return serviceEmploye.save(employe);
	}
    
    @GetMapping("/allEmploye")  
    private List<Employee> findAllEmploye()   
    {  
    return serviceEmploye.findAllEmploye();  
    }  
   
    
    @DeleteMapping("/delete/{id}")
    public void deletePlan(@PathVariable("id") Long id){
    	serviceEmploye.deleteEmployee(id);
        
    }


}
