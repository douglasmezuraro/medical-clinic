package Controller;

import Model.Patient;
import Actors.Secretary;
import View.PatientsView;

public class PatientsController {
    
    private final PatientsView view;
    private final Secretary secretary;
    private Patient model;
    
    public PatientsController() {
        view = new PatientsView();
        secretary = new Secretary();
        bindListeners();
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((actionListener) -> {
            model = secretary.findPatient(view.getId());
            view.modelToView(model);
            controlButtons();
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            secretary.removePatient(model);
            view.clearView();
            controlButtons();
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            secretary.updatePatient(view.viewToModel(model));
        });
        
        view.getNewButton().addActionListener((actionListener) -> {
            model = secretary.newPatient();
            secretary.addPatient(view.viewToModel(model));
            controlButtons();
        });
    }
    
    public void showView() {
        view.setVisible(true);
        controlButtons();
    }
    
    public void controlButtons() {
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);
    }
    
}
