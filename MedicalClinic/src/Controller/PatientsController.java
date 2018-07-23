package Controller;

import Model.Doctor;
import Model.Patient;
import Model.Secretary;
import View.PatientsView;

public class PatientsController {
    
    private final PatientsView view;
    private final Object user;
    private Patient model;
    
    public PatientsController(Object user) {
        this.user = user;
        view = new PatientsView();        
    }
    
    public final void bindListeners() {
        if(getSecretary() != null) {
            view.getRetrieveButton().addActionListener((actionListener) -> {
                model = getSecretary().findPatient(view.getId());
                view.modelToView(model);
                controlView();
            });      

            view.getRemoveButton().addActionListener((actionListener) -> {
                getSecretary().removePatient(model);
                view.clear();
                controlView();
            });

            view.getEditButton().addActionListener((actionListener) -> {
                getSecretary().updatePatient(view.viewToModel(model));
            });

            view.getAddButton().addActionListener((actionListener) -> {
                model = getSecretary().newPatient();
                getSecretary().addPatient(view.viewToModel(model));
                view.setId(model.getId());
                controlView();
            });
        }
        else if(getDoctor() != null) {
        
        }
    }
    
    public void showView() {
        view.setVisible(true);
        view.clear();
        bindListeners();
        controlView();
    }
    
    private void controlView() {      
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);       
        
        if(getSecretary() == null)
            view.getPanes().remove(view.getPatientDataPane());
     
        if(getDoctor() == null)             
            view.getPanes().remove(view.getAggravationPane());        
    }
    
    
    private Secretary getSecretary() {
        return user instanceof Secretary ? (Secretary) user : null;
    }
    
    private Doctor getDoctor() {
        return user instanceof Doctor ? (Doctor) user : null;
    }    
    
}
