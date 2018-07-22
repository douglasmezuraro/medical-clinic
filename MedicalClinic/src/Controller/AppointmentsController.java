package Controller;

import View.AppointmentsView;

public class AppointmentsController {
    
    private final AppointmentsView view;
    
    public AppointmentsController() {
        view = new AppointmentsView();
    }
    
    public void showView() {
        view.setVisible(true);
    }
    
}
