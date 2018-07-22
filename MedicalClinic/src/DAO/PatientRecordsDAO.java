package DAO;

import Model.PatientRecord;

public class PatientRecordsDAO extends DAO<PatientRecord> {

    public PatientRecordsDAO() {
        super(PatientRecord.class);
    }

    @Override
    public void seed() {
        
    }
    
}
