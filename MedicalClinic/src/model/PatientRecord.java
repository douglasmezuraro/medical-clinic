package Entities;

public class PatientRecord extends Base {

    private String symptoms = "";
    private String diagnosis = "";
    private String treatmentPrescription = "";

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
    
    @Override
    public String toString() {
        return String.format(
            "SINTOMAS: %s\nDIAGNÓSTICO: %s\nTRATAMENTO: %s",
            symptoms,
            diagnosis,
            treatmentPrescription).toUpperCase();
    }

}
