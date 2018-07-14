package model;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    private Aggravation aggravation;
    private List<PatientRecord> records;
    private AgreementType agreementType;

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

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

}
