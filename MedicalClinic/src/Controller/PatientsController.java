package Controller;

import Model.Patient;
import Model.Secretary;
import View.PatientsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class PatientsController {
    
    private final PatientsView view;
    private final Secretary s;
    
    public PatientsController() {
        view = new PatientsView();
        s = new Secretary();
        bindEvents();
    }
    
    public void bindEvents() {
        view.getRemoveButton().addActionListener((ae) -> {
            s.removePatient(getRow().getId());
        });
    }
    
    public void showView() {
        view.setVisible(true);
    }
    
    private Patient getRow() {
        return (Patient)view.getPatientList().get(view.getDataTable().getSelectedRow());
    }
  
}
