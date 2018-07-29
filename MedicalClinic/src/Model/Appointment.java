package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "APPOINTMENTS")
public class Appointment extends Base {

    @Temporal(TemporalType.DATE)
    private Date appointmentDate;
    
    @Temporal(TemporalType.TIME)
    private Date appointmentHour;
    
    @OneToOne
    private Doctor doctor;
    
    @OneToOne
    private Patient patient;
    
    @OneToOne
    private AppointmentType appointmentType;

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;     
    }

    public Date getAppointmentHour() {
        return appointmentHour;
    }

    public void setAppointmentHour(Date appointmentHour) {
        this.appointmentHour = appointmentHour;
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
    
}
