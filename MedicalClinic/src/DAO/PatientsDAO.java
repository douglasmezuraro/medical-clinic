package DAO;

import Model.Patient;

public class PatientsDAO extends DAO<Patient> {
    
    public PatientsDAO() {
        super(Patient.class);
    }

    @Override
    public void seed() {
      
    }
      
}
