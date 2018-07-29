package Controller;

import Model.Appointment;
import Model.Secretary;
import View.AppointmentsView;

public final class AppointmentsController {
    
    private final AppointmentsView view;
    private final Secretary secretary;
    private Appointment model;
    
    public AppointmentsController(Secretary secretary) {
        this.secretary = secretary;
        view = new AppointmentsView();
        view.setVisible(true);
        view.clear();
        bindListeners();
        controView();        
    }
    
    public final void bindListeners() {
        view.getRetrieveButton().addActionListener((event) -> {
            model = secretary.findAppointment(view.getId());
            view.modelToView(model);
            controView();
        });      
        
        view.getRemoveButton().addActionListener((event) -> {
            secretary.removeAppointment(model);
            view.clear();
            controView();
        });
        
        view.getEditButton().addActionListener((event) -> {
            secretary.updateAppointment(view.viewToModel(model));
        });
        
        view.getAddButton().addActionListener((event) -> {
            model = secretary.newAppointment();
            secretary.addAppointment(view.viewToModel(model));
            view.setId(model.getId());
            controView();
        });
    }
    
    public void controView() {
        view.getEditButton().setEnabled(model != null);
        view.getRemoveButton().setEnabled(model != null);
    }
    
}
