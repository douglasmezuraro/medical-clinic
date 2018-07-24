package Controller;

import Model.Doctor;
import Model.Secretary;
import View.PrincipalView;

public final class PrincipalController {
    
    private final Doctor doctor;
    private final Secretary secretary;
    private final PrincipalView view;    
    
    public PrincipalController() {
        doctor = new Doctor();
        secretary = new Secretary();
        view = new PrincipalView();
        view.setVisible(true);
        bindListeners();
    }
    
    public void bindListeners() {
        view.getPatientsMenuItem().addActionListener((listener) -> {
            PatientsController patientsController = new PatientsController(secretary);
        });
        
        view.getAppointmentsMenuItem().addActionListener((listener) -> {
            AppointmentsController appointmentsController = new AppointmentsController(secretary);
        });
        
        view.getPatientRecordsMenuItem().addActionListener((listener) -> {
            PatientRecordsController patientRecordsController = new PatientRecordsController(doctor);
        });
        
        view.getAggravationsMenuItem().addActionListener((listener) -> {
            AggravationsController aggravationsController = new AggravationsController(doctor);
        });
    }

}
