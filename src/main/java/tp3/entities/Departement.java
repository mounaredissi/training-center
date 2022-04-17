package tp3.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_DEPARTEMENT")
	private long id;
	
	private String nom;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Employee>employees;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Entreprise entrp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Employee> getEmployes() {
		return employees;
	}

	public void setEmployes(Set<Employee> employees) {
		this.employees = employees;
	}

	public Entreprise getEntrp() {
		return entrp;
	}

	public void setEntrp(Entreprise entrp) {
		this.entrp = entrp;
	}
	
	
	

}
