package Controller;

import Model.Doctor;
import Model.Patient;
import View.AggravationsView;

public class AggravationsController {
    
    private final AggravationsView view;
    private final Doctor doctor;
    private Patient model;
    
    public AggravationsController(Doctor doctor) {
        this.doctor = doctor;
        view = new AggravationsView();
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((actionListener) -> {
            model = doctor.findPatient(view.getId());
            view.modelToView(model);
            controlView();
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            doctor.removeAggravation(model.getAggravation());
            view.clear();
            controlView();
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            doctor.updateAggravation(view.viewToModel(model).getAggravation());
        });
        
        view.getAddButton().addActionListener((actionListener) -> {
            model.setAggravation(doctor.newAggravation());
            doctor.addAggravation(view.viewToModel(model).getAggravation());
            view.setId(model.getId());
            controlView();
        });
    }    
    
    public void showView() {
        view.setVisible(true);
        view.clear();
        bindListeners();
        controlView();
    }
    
    public void controlView() {
        view.getAddButton().setEnabled((model != null) && (model.getAggravation() == null));
        view.getEditButton().setEnabled((model != null) && (model.getAggravation() != null));
        view.getRemoveButton().setEnabled((model != null) && (model.getAggravation() != null));
    }
    
}
