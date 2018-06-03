package Classes;

import Boundary.Appointments;
import Boundary.Doctors;
import Boundary.PatientRecords;
import Boundary.Patients;
import Boundary.Secretaries;
import Entities.Appointment;
import Entities.AppointmentType;
import Entities.Doctor;
import Entities.Patient;
import Entities.Person;
import Entities.Secretary;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class DataBase {
    
    private Patients patients;
    private Doctors doctors;
    private Secretaries secretaries;
    private Appointments appointments;
    private PatientRecords patientRecords;
    
    public DataBase() {
        patients = new Patients();
        doctors = new Doctors();
        secretaries = new Secretaries();
        appointments = new Appointments(doctors, patients);
        patientRecords = new PatientRecords();
    }

    public Patients getPatients() {
        return patients;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public Secretaries getSecretaries() {
        return secretaries;
    }

    public Appointments getAppointments() {
        return appointments;
    }

    public PatientRecords getPatientRecords() {
        return patientRecords;
    }
    
    public Person getPersonByEmail(String email) {
        for(Person p: patients.list) 
            if(p.getEmail().getAddress().equalsIgnoreCase(email))
                return p;
        
        for(Person p: doctors.list) 
            if(p.getEmail().getAddress().equalsIgnoreCase(email))
                return p;
        
        
        for(Person p: secretaries.list) 
            if(p.getEmail().getAddress().equalsIgnoreCase(email))
                return p;
        
        return null;
    }
    
    public Person getPersonByPhone(String phone) {
        for(Person p: patients.list) 
            if(p.getPhone().getNumber().equalsIgnoreCase(phone))
                return p;
        
        for(Person p: doctors.list) 
            if(p.getPhone().getNumber().equalsIgnoreCase(phone))
                return p;
        
        
        for(Person p: secretaries.list) 
            if(p.getPhone().getNumber().equalsIgnoreCase(phone))
                return p;
        
        return null;
    }
    
    // TODO : Após finalizar trabalho remover esse método
    public void Populate() {
        Doctor d1 = new Doctor();
        d1.setId(1);
        d1.setName("Doctor #" + d1.getId());
        d1.getEmail().setAddress("douglasmez@gmail.com");
        doctors.list.add(d1);
        
        Doctor d2 = new Doctor();
        d2.setId(2);
        d2.setName("Doctor #" + d2.getId());
        doctors.list.add(d2);
        
        Patient p1 = new Patient();
        p1.setId(1);
        p1.setName("Patient #" + p1.getId());
        patients.list.add(p1);
        
        Patient p2 = new Patient();
        p2.setId(2);
        p2.setName("Patient #" + p2.getId());        
        patients.list.add(p2);
        
        Secretary s1 = new Secretary();
        s1.setId(1);
        s1.getEmail().setAddress("teste@teste.com");
        s1.setName("Secretary #" + s1.getId());
        secretaries.list.add(s1);       
        
        Appointment a1 = new Appointment();
        a1.setId(1);
        a1.setAppointmentType(AppointmentType.accompaniment);
        a1.setData(Date.valueOf(LocalDate.now().plusDays(1)));
        a1.setHour(Time.valueOf("13:30:00"));
        a1.setDoctor(d1);
        a1.setPatient(p1);
        appointments.list.add(a1);
        
        Appointment a2 = new Appointment();
        a2.setId(2);
        a2.setAppointmentType(AppointmentType.regular);
        a2.setData(Date.valueOf(LocalDate.now().plusDays(2)));
        a2.setHour(Time.valueOf("14:00:00"));
        a2.setDoctor(d2);
        a2.setPatient(p2);
        appointments.list.add(a2);
        
        Appointment a3 = new Appointment();
        a3.setId(3);
        a3.setAppointmentType(AppointmentType.regular);
        a3.setData(Date.valueOf(LocalDate.now().plusDays(1)));
        a3.setHour(Time.valueOf("14:00:00"));
        a3.setDoctor(d2);
        a3.setPatient(p2);
        appointments.list.add(a3);
    }
    
}
