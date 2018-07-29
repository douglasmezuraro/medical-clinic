package Controller;

import Model.Doctor;
import Model.Secretary;
import View.PrincipalView;
import View.ReportsSecretaryView;

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
        view.getDoctorRadioButton().setSelected(true);
        controlView();
    }
    
    public void bindListeners() {
        view.getSecretaryReportsMenuItem().addActionListener((event) -> {
            ReportsSecretaryView view = new ReportsSecretaryView();
            view.setVisible(true);
        });
       
        view.getPatientsMenuItem().addActionListener((event) -> {
            PatientsController patientsController = new PatientsController(secretary);
        });
        
        view.getAppointmentsMenuItem().addActionListener((event) -> {
            AppointmentsController appointmentsController = new AppointmentsController(secretary);
        });
        
        view.getPatientRecordsMenuItem().addActionListener((event) -> {
            PatientRecordsController patientRecordsController = new PatientRecordsController(doctor);
        });
        
        view.getAggravationsMenuItem().addActionListener((event) -> {
            AggravationsController aggravationsController = new AggravationsController(doctor);
        });
        
        view.getDoctorRadioButton().addActionListener((event) -> {
            controlView();
        });
        
        view.getSecretaryRadioButton().addActionListener((event) -> {
            controlView();
        });
    }
    
    public void controlView() {
        view.getSecretariesMenu().setEnabled(view.getSecretaryRadioButton().isSelected());
        view.getDoctorMenu().setEnabled(view.getDoctorRadioButton().isSelected());
    }

}
