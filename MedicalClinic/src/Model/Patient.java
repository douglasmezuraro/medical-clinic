package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENTS")
public class Patient extends Person {

    @OneToOne(cascade = CascadeType.ALL)
    private Aggravation aggravation;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<PatientRecord> records;
    
    @OneToOne
    private Agreement agreement;

    public Patient() {
        aggravation = new Aggravation();
        records = new ArrayList<>();
    }
    
    public Aggravation getAggravation() {
        return aggravation;
    }

    public void setAggravation(Aggravation aggravation) {
        this.aggravation = aggravation;
    }

    public List<PatientRecord> getRecords() {
        return records;
    }

    public void setRecords(List<PatientRecord> records) {
        this.records = records;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
    
}
