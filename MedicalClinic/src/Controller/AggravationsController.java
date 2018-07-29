package Controller;

import Model.Doctor;
import Model.Patient;
import View.AggravationsView;

public final class AggravationsController {
    
    private final AggravationsView view;
    private final Doctor doctor;
    private Patient model;
    
    public AggravationsController(Doctor doctor) {
        this.doctor = doctor;
        view = new AggravationsView();
        view.setVisible(true);
        view.clear();
        bindListeners();
        controlView();
    }
    
    public final void bindListeners() {      
        view.getRetrieveButton().addActionListener((event) -> {
            model = doctor.findPatient(view.getId());           
            view.modelToView(model);
            controlView();
        });
        
        view.getEditButton().addActionListener((event) -> {
            doctor.updateAggravation(view.viewToModel(model).getAggravation());
        }); 
    }    

    public void controlView() {
        view.getEditButton().setEnabled(model != null);
    }
    
}
