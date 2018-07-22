package Controller;

import Model.Patient;
import Model.Secretary;
import View.PatientsView;

public class PatientsController {
    
    private final PatientsView view;
    private final Secretary secretary;
    private Patient model;
    
    public PatientsController(Secretary secretary) {
        this.secretary = secretary;
        view = new PatientsView();        
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((actionListener) -> {
            model = secretary.findPatient(view.getId());
            view.modelToView(model);
            controlButtons();
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            secretary.removePatient(model);
            view.clear();
            controlButtons();
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            secretary.updatePatient(view.viewToModel(model));
        });
        
        view.getAddButton().addActionListener((actionListener) -> {
            model = secretary.newPatient();
            secretary.addPatient(view.viewToModel(model));
            view.setId(model.getId());
            controlButtons();
        });
    }
    
    public void showView() {
        view.setVisible(true);
        view.clear();
        bindListeners();
        controlButtons();
    }
    
    public void controlButtons() {
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);
    }
    
}
