package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PATIENTS")
public class Patient extends Person {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Transient
    private Aggravation aggravation;
    
    @OneToMany
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

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
