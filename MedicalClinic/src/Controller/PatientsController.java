package Controller;

import Model.Patient;
import Model.Secretary;
import View.PatientsView;

public final class PatientsController {
    
    private final PatientsView view;
    private final Secretary secretary;
    private Patient model;
    
    public PatientsController(Secretary secretary) {
        this.secretary = secretary;
        view = new PatientsView();  
        view.setVisible(true);
        view.clear();
        bindListeners();
        controlView();        
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((event) -> {
            model = secretary.findPatient(view.getId());
            view.modelToView(model);
            controlView();
        });      

        view.getRemoveButton().addActionListener((event) -> {
            secretary.removePatient(model);
            view.clear();
            controlView();
        });

        view.getEditButton().addActionListener((event) -> {
            secretary.updatePatient(view.viewToModel(model));
        });

        view.getAddButton().addActionListener((event) -> {
            model = secretary.newPatient();
            secretary.addPatient(view.viewToModel(model));
            view.setId(model.getId());
            controlView();
        });
    }
   
    private void controlView() {      
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);            
    }

}
