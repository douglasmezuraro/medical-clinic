package Model;

import DAO.AggravationsDAO;
import DAO.PatientRecordsDAO;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DOCTORS")
public class Doctor extends User {

    @Transient
    private PatientRecordsDAO patientRecordsDAO;
    
    @Transient
    private AggravationsDAO aggravationsDAO;

    public Doctor() {
        patientRecordsDAO = new PatientRecordsDAO();
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
    
    public Aggravation findAggravation(Long patientId) {
        return aggravationsDAO.find(patientId);
    }
    
}
