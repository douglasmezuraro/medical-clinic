package Boundary;

import Entities.Appointment;

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
    }
    
    @Override
    public void create() {
        createOrUpdate(new Appointment());
    }
    
}
