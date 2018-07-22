package Model;

import DAO.PatientRecordsDAO;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DOCTORS")
public class Doctor extends User {

    @Transient
    private PatientRecordsDAO patientRecordsDAO;

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

}
