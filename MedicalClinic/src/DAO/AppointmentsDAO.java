package DAO;

import Model.Appointment;

public class AppointmentsDAO extends DAO<Appointment> {

    public AppointmentsDAO() {
        super(Appointment.class);
    }

    @Override
    public void seed() {
        
    }
    
}
