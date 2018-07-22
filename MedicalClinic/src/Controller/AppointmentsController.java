package Controller;

import Model.Appointment;
import Model.Secretary;
import View.AppointmentsView;

public class AppointmentsController {
    
    private final AppointmentsView view;
    private final Secretary secretary;
    private Appointment model;
    
    public AppointmentsController(Secretary secretary) {
        this.secretary = secretary;
        view = new AppointmentsView();
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((actionListener) -> {
            model = secretary.findAppointment(view.getId());
            view.modelToView(model);
            controlButtons();
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            secretary.removeAppointment(model);
            view.clear();
            controlButtons();
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            secretary.updateAppointment(view.viewToModel(model));
        });
        
        view.getAddButton().addActionListener((actionListener) -> {
            model = secretary.newAppointment();
            secretary.addAppointment(view.viewToModel(model));
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
