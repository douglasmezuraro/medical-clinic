package Controller;

import Model.Doctor;
import Model.PatientRecord;
import View.PatientRecordsView;

public final class PatientRecordsController {
 
    private final PatientRecordsView view;
    private final Doctor doctor;
    private PatientRecord model;
    
    public PatientRecordsController(Doctor doctor) {
        this.doctor = doctor;
        view = new PatientRecordsView();
        view.setVisible(true);
        view.clear();
        bindListeners();
        controlView();
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((event) -> {
            model = doctor.findPatientRecord(view.getId());
            view.modelToView(model);
            controlView();
        });      
        
        view.getRemoveButton().addActionListener((event) -> {
            doctor.removePatientRecord(model);
            view.clear();
            controlView();
        });
        
        view.getEditButton().addActionListener((event) -> {
            doctor.updatePatientRecord(view.viewToModel(model));
        });
        
        view.getAddButton().addActionListener((event) -> {
            model = doctor.newPatientRecord();
            doctor.addPatientRecord(view.viewToModel(model));
            view.setId(model.getId());
            controlView();
        });
    }
    
    public void controlView() {
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);
    }
    
}
