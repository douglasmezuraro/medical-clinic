package Model;

import Utils.Constants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENTRECORDS")
public class PatientRecord extends Base {

    @OneToOne
    private Patient patient;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String symptoms;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String diagnosis;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String treatment;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }    
    
    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

}
