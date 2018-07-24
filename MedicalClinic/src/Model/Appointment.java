package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "APPOINTMENTS")
public class Appointment extends Base {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Temporal(TemporalType.DATE)
    private Date appoinmentDate;
    
    @Temporal(TemporalType.TIME)
    private Date appointmentHour;
    
    @OneToOne
    private Doctor doctor;
    
    @OneToOne
    private Patient patient;
    
    @OneToOne
    private AppointmentType appointmentType;

    public Date getAppoinmentDate() {
        return appoinmentDate;
    }

    public void setAppoinmentDate(Date appoinmentDate) {
        Date oldAppoinmentDate = this.appoinmentDate;
        this.appoinmentDate = appoinmentDate;
        changeSupport.firePropertyChange("appoinmentDate", oldAppoinmentDate, appoinmentDate);
    }

    public Date getAppointmentHour() {
        return appointmentHour;
    }

    public void setAppointmentHour(Date appointmentHour) {
        Date oldAppointmentHour = this.appointmentHour;
        this.appointmentHour = appointmentHour;
        changeSupport.firePropertyChange("appointmentHour", oldAppointmentHour, appointmentHour);
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

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
