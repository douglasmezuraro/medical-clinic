package Model;

import DAO.AggravationsDAO;
import DAO.PatientRecordsDAO;
import DAO.PatientsDAO;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DOCTORS")
public class Doctor extends User {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Transient
    private final PatientsDAO patientsDAO;
    
    @Transient
    private final PatientRecordsDAO patientRecordsDAO;
    
    @Transient
    private final AggravationsDAO aggravationsDAO;

    public Doctor() {
        patientsDAO = new PatientsDAO();
        patientRecordsDAO = new PatientRecordsDAO();
        aggravationsDAO = new AggravationsDAO();
    }

    public PatientRecord newPatientRecord() {
        return new PatientRecord();
    }
    
    public void addPatientRecord(PatientRecord patientRecord) {
        patientRecordsDAO.add(patientRecord);
    }
    
    public void updatePatientRecord(PatientRecord patientRecord) {
        patientRecordsDAO.update(patientRecord);
    }
    
    public void removePatientRecord(PatientRecord patientRecord) {
        patientRecordsDAO.remove(patientRecord);
    }
    
    public PatientRecord findPatientRecord(Long id) {
        return patientRecordsDAO.find(id);
    }
    
    public Aggravation newAggravation() {
        return new Aggravation();
    }
    
    public void addAggravation(Aggravation aggravation) {
        aggravationsDAO.add(aggravation);
    }
    
    public void updateAggravation(Aggravation aggravation) {
        aggravationsDAO.update(aggravation);
    }
    
    public void removeAggravation(Aggravation aggravation) {
        aggravationsDAO.remove(aggravation);
    }
    
    public Patient findPatient(Long id) {
        return patientsDAO.find(id);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
