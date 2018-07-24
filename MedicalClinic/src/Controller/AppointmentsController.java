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
            controView();
        });      
        
        view.getRemoveButton().addActionListener((actionListener) -> {
            secretary.removeAppointment(model);
            view.clear();
            controView();
        });
        
        view.getEditButton().addActionListener((actionListener) -> {
            secretary.updateAppointment(view.viewToModel(model));
        });
        
        view.getAddButton().addActionListener((actionListener) -> {
            model = secretary.newAppointment();
            secretary.addAppointment(view.viewToModel(model));
            view.setId(model.getId());
            controView();
        });
    }
    
    public void showView() {
        view.setVisible(true);
        view.clear();
        bindListeners();
        controView();
    }
    
    public void controView() {
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);
    }
    
}
