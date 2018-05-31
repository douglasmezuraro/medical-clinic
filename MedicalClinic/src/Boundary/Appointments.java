package Boundary;

import Entities.Appointment;
import java.sql.Date;
import java.sql.Time;

public class Appointments extends Crud<Appointment> {
    
    private Doctors doctors;
    private Patients patients;
    
    public Appointments(Doctors doctors, Patients patients) {
        this.doctors = doctors;
        this.patients = patients;
    }
    
    @Override
    protected void createOrUpdate(Appointment object) {
        object.setData(input.readDate("Digite a data (yyyy-mm-dd):"));
        object.setHour(input.readTime("Digite a hora (hh:mm:ss):"));
        object.setDoctor(doctors.retrieve());
        object.setPatient(patients.retrieve());
        
        System.out.println();
        
    }
    
    @Override
    protected void create() {
        createOrUpdate(new Appointment());
    }
    
}
