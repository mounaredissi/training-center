package tp3.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("fils")
public class MissionExtreme extends Mission implements Serializable {
   private static final long serialVersionUID=1L;
   
   @Column(name="EMAIL_FACTURATION")
   private String emailFacturation;
   
   @Column(name="TAUX_JOURNALIER")
   private String tauxJournalisationMoyen;
   
}
