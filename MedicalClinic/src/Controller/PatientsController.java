package Controller;

import Classes.Constants;
import Model.Patient;
import Model.Secretary;
import View.PatientsView;

public class PatientsController {
    
    private final PatientsView view;
    private final Secretary secretary;
    private Patient model;
    
    public PatientsController() {
        view = new PatientsView();
        secretary = new Secretary();
        bindEvents();
    }
    
    public final void bindEvents() {
        view.getSearchButton().addActionListener((l) -> {
            model = secretary.findPatient(Long.parseLong(view.getIdTextField().getText()));
            modelToView();
        });      
        
        view.getRemoveButton().addActionListener((l) -> {
            if(model != null) {
                secretary.removePatient(model);
                clearView();
            }
        });
        
        view.getEditButton().addActionListener((l) -> {
            viewToModel();
            secretary.updatePatient(model);
        });
    }
    
    public void showView() {
        view.setVisible(true);
    }
    
    public void modelToView() {
        if(model != null) {
            view.getIdTextField().setText(model.getId().toString());
            view.getNameTextField().setText(model.getName());
            view.getLastNameTextField().setText(model.getLastName());
            view.getContactTextField().setText(model.getContact());
            view.getBirthFormattedField().setText(model.getBirth().toString());
            view.getAddressTextField().setText(model.getAddress());
        }
    }
    
    public void viewToModel() {
        if(model != null) {
            model.setName(view.getNameTextField().getText());
            model.setLastName(view.getLastNameTextField().getText());
            model.setContact(view.getContactTextField().getText());
            model.setAddress(view.getAddressTextField().getText());
        }
    }
    
    public void clearView() {
        view.getIdTextField().setText(Constants.EMPTY_STRING);
        view.getNameTextField().setText(Constants.EMPTY_STRING);
        view.getLastNameTextField().setText(Constants.EMPTY_STRING);
        view.getContactTextField().setText(Constants.EMPTY_STRING);
        view.getBirthFormattedField().setText(Constants.EMPTY_STRING);
        view.getAddressTextField().setText(Constants.EMPTY_STRING);        
    }
    
  
}
