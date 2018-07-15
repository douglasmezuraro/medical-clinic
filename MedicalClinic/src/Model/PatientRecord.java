package Model;

import Classes.Constants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENTRECORDS")
public class PatientRecord extends Base {

    @Column(length = Constants.LONG_DESCRIPTION)
    private String symptoms;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String diagnosis;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String treatmentPrescription;

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

    public String getTreatmentPrescription() {
        return treatmentPrescription;
    }

    public void setTreatmentPrescription(String treatmentPrescription) {
        this.treatmentPrescription = treatmentPrescription;
    }

}
