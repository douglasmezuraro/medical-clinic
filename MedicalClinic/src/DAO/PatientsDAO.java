package DAO;

import Model.Aggravation;
import Model.Patient;

public class PatientsDAO extends DAO<Patient> {
    
    public PatientsDAO() {
        super(Patient.class);
    }
    
    @Override
    public void seed() {
      
    }
    
    @Override 
    public void add(Patient model) {
        super.add(model);
        Aggravation aggravation = new Aggravation();
        aggravation.setPatient(model);
        new AggravationsDAO().add(aggravation);
    }
      
}
