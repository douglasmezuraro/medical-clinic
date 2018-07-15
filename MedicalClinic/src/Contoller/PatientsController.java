package Contoller;

import Model.Patient;
import Model.Secretary;

public class PatientsController {
    
    private final Secretary secretary;
    
    public PatientsController(Secretary secretary) {
        this.secretary = secretary;
    }

    public void addPatient(Patient model) {
        secretary.addPatient(model);
    }

    public void updatePatient(Patient model) {
        secretary.updatePatient(model);
    }

    public void removePatient(Patient model) {
        secretary.removePatient(model);
    }

    
}
