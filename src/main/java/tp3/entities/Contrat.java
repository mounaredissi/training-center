package tp3.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Contrat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_Contrat")
	private long idC;
	
	private Date dateDebut;
	
	private String typeContrat;
	
	private Long salaire;
	
	@OneToOne
	private Employee Emp;
	
	
	
	
	
}
