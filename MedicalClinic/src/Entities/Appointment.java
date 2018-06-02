package Entities;

import Classes.Base;
import java.sql.Time;
import java.util.Date;

public class Appointment extends Base {

    private Date data;
    private Time hour;
    private Doctor doctor;
    private Patient patient;
    private AppointmentType appointmentType;

    public Appointment() {
        doctor = new Doctor();
        patient = new Patient();
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
    }
    
    @Override
    public String toString() {
        return String.format(
            "CONSULTA ID: %dDATA: %tF\nHORA: %tH\nPACIENTE: %s %s\nMÉDICO(A): %s %s\nTIPO: %s",
            id,
            data,
            hour,
            patient.getName(),
            patient.getLastName(),
            doctor.getName(),
            doctor.getLastName(),
            appointmentType.getDescription()).toUpperCase();
    }
    
}
