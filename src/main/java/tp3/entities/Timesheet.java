package tp3.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import tp3.entities.Date;

public class Timesheet {
	private static final long  serialVersionUId=1L;
	private String  isValid;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToOne
	@JoinColumn(name="id_Emp" , referencedColumnName="ID_EMPL",
	          insertable=false , updatable=false)
	private Employee employee;
	




	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public static long getSerialversionuid() {
		return serialVersionUId;
	}

	public Timesheet( String isValid, Date dateDebut, Date dateFin, Employee employee,
			Mission mission) {
		super();
		this.isValid = isValid;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.employee = employee;
		this.mission = mission;
	}

	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
	@JoinColumn(name="id" , referencedColumnName="ID_Mission",
	          insertable=false , updatable=false)
	private Mission mission;
}
