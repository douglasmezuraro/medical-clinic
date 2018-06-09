package Cruds;

import Entities.Appointment;

public class Appointments extends Crud<Appointment> {
    
    private Doctors doctors;
    private Patients patients;
    
    public Appointments(Doctors doctors, Patients patients) {
        this.doctors = doctors;
        this.patients = patients;
        this.description = "consulta";
    }
    
    @Override
    public int create() {
        return createOrUpdate(new Appointment());
    }
    
    @Override
    protected int createOrUpdate(Appointment object) {
        object.setData(input.readDate("Digite a data (dd/mm/aaaa):"));
        object.setHour(input.readTime("Digite a hora (hh:mm:ss):"));
        object.setDoctor(doctors.retrieve());
        object.setPatient(patients.retrieve());
        return super.add(object);
    }
    
}
