package Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENTS")
public class Patient extends Person {

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Aggravation aggravation;
    
    @OneToOne
    private Agreement agreement;
  
    @OneToMany
    private List<PatientRecord> records;
    
    public Aggravation getAggravation() {
        return aggravation;
    }

    public void setAggravation(Aggravation aggravation) {
        this.aggravation = aggravation;
    }    
    
    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }    
    
    public List<PatientRecord> getRecords() {
        return records;
    }

    public void setRecords(List<PatientRecord> records) {
        this.records = records;
    }

}
