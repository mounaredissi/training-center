package tp3.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="TABLE-PARENT-MISSION")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "MISSION",
discriminatorType = DiscriminatorType.STRING)

@DiscriminatorValue("Parent")
public class Mission implements Serializable {
 
	
	private long id;
	private String name;
	private String description;
}
