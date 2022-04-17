package tp3.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tp3.entities.Employee;
import tp3.repository.EmployeeRepo;
import tp3.repository.EntrepriseRepo;



@Service
@Transactional
public class ServiceEmploye {
	
	 @Autowired
	    private  EmployeeRepo employeeRepo ;
	    
	   
	    public ServiceEmploye(EntrepriseRepo entrepriseRepo) {
	        this.employeeRepo = employeeRepo;
	    }
	    public Employee save(Employee employee) {
			return employeeRepo.save(employee);
		}
	    public Employee fetchUserByEmailAndPassword(String email,String password) {
	    	
		return employeeRepo.findByEmailAndPassword(email,password);
	}
	    
	    public List<Employee> findAllEmploye(){
	        return employeeRepo.findAll();
	    }
	    
	    public void deleteEmployee(Long id){
	    	employeeRepo.deleteEmployeeById(id);
	    }

		
}
