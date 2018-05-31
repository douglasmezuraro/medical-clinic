package Entities;

import Classes.Base;
import java.util.Date;

public class PatientRecord extends Base {

    private String symptoms;
    private String diagnosis;
    private Date treatmentPrescription;

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

    public Date getTreatmentPrescription() {
        return treatmentPrescription;
    }

    public void setTreatmentPrescription(Date treatmentPrescription) {
        this.treatmentPrescription = treatmentPrescription;
    }

}
