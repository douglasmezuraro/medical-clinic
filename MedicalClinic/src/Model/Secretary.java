package Model;

import DAO.PatientsDAO;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "SECRETARIES")
public class Secretary extends Person {
  
    @Transient
    private final PatientsDAO patientsDAO;
    //private final AppointmentsDAO appointmentsDAO;

    public Secretary() {
        patientsDAO = new PatientsDAO();
        //this.appointmentsDAO = new AppointmentsDAO();
    }
    
    // Pacientes
    public void addPatient(Patient patient) {
        patientsDAO.add(patient);
    }
    
    public void updatePatient(Patient patient) {
        patientsDAO.update(patient);
    }
    
    public void removePatient(Patient patient) {
        patientsDAO.remove(patient);
    }
    
    public Patient findPatient(Integer id) {
        return patientsDAO.find(id);
    }
    
    // Consultas
//    public void addAppointment(Appointment appointment) {;
//        appointmentsDAO.add(appointment);
//    }
//    
//    public void updateAppointment(Appointment appointment) {
//        appointmentsDAO.update(appointment);
//    }
//
//    public void removeAppointment(Appointment appointment) {
//        appointmentsDAO.remove(appointment);
//    }
//
//    public Appointment findAppointment(Integer id) {
//        return appointmentsDAO.find(id);
//    }
    
}
