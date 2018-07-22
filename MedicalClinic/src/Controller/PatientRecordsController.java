package Controller;

import Model.Doctor;
import Model.PatientRecord;
import View.PatientRecordsView;

public class PatientRecordsController {
 
    private final PatientRecordsView view;
    private final Doctor doctor;
    private PatientRecord model;
    
    public PatientRecordsController(Doctor doctor) {
        this.doctor = doctor;
        view = new PatientRecordsView();
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((actionListener) -> {
            model = doctor.findPatientRecord(view.getId());
            view.modelToView(model);
            controlButtons();
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            doctor.removePatientRecord(model);
            view.clear();
            controlButtons();
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            doctor.updatePatientRecord(view.viewToModel(model));
        });
        
        view.getAddButton().addActionListener((actionListener) -> {
            model = doctor.newPatientRecord();
            doctor.addPatientRecord(view.viewToModel(model));
            view.setId(model.getId());
            controlButtons();
        });
    }
    
    public void showView() {
        view.setVisible(true);
        bindListeners();
        controlButtons();
    }
    
    public void controlButtons() {
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);
    }
    
}
