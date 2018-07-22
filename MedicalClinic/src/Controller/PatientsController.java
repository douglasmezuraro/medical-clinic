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
        view.getSearchButton().addActionListener((actionListener) -> {
            model = secretary.findPatient(view.getId());
            view.modelToView(model);
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            if(model != null) {
                secretary.removePatient(model);
                view.clearView();
            }
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            secretary.updatePatient(view.viewToModel(model));
        });
        
        view.getNewButton().addActionListener((actionListener) -> {
            model = secretary.newPatient();
            secretary.addPatient(view.viewToModel(model));
        });
    }
    
    public void showView() {
        view.setVisible(true);
    }
    
}
