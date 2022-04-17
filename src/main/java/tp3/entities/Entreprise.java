package tp3.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Entreprise {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ENTREPRISE")
	private long id_Ent;
	
	private String nom;
	private String raisonSociale;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Departement>departements;

	public long getId() {
		return id_Ent;
	}

	public void setId(long id) {
		this.id_Ent = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public Set<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(Set<Departement> departements) {
		this.departements = departements;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id_Ent + ", nom=" + nom + ", raisonSociale=" + raisonSociale + ", departements="
				+ departements + "]";
	}

	public Entreprise(long id, String nom, String raisonSociale, Set<Departement> departements) {
		super();
		this.id_Ent = id;
		this.nom = nom;
		this.raisonSociale = raisonSociale;
		this.departements = departements;
	}
	
	
	

}
