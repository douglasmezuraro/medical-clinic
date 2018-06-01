package Classes;

import Boundary.Appointments;
import Boundary.Doctors;
import Boundary.Patients;
import Boundary.Secretaries;
import Entities.Appointment;
import Entities.AppointmentType;
import Entities.Doctor;
import Entities.Patient;
import Entities.Secretary;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class Main {
    
    // Constantes
    private static final String sLineBreak = "\n";
    // Objetos utéis
    private static Actor actor = Actor.Undefined;
    private static CustomScanner input = new CustomScanner();
    // Objetos de cadastro
    private static Patients patients = new Patients();
    private static Doctors doctors = new Doctors();
    private static Secretaries secretaries = new Secretaries();
    private static Appointments appointments = new Appointments(doctors, patients);
    
    /* Métodos utéis */
    
    public static MenuAction getMenuAction() {
        MenuAction action = MenuAction.ShowAgain;
       
        println(action.toString(actor) + sLineBreak);
        
        int index = input.readInt("Digite o número da opção que deseja:");
        action = MenuAction.values()[index - 1];
        
        if(action.getActor().equals(Actor.Undefined))
            return action;
        
        if(!action.getActor().equals(actor)) { 
            System.out.println("Ação não permitida!");
            action = MenuAction.ShowAgain;
        }
        
        return action;
    }
    
    public static CrudAction getCrudAction() {
        CrudAction action = CrudAction.Retrieve;
        
        println(action.toString() + sLineBreak);
        
        int index = input.readInt("Digite o número da opção que deseja:");
        return CrudAction.values()[index - 1];
    }
    
    public static void println(String string) {
        System.out.println("");
        for(int i = 0; i <= 50; i++)
            System.out.print("-");
        System.out.println("");
        System.out.println(string);
    }
    
    /* Ações principais */
    
    public static void loggin() {
        println(
            "Identifique-se:" + sLineBreak +
            actor.toString());
        
        int index = input.readInt("");
        actor = Actor.values()[index - 1];
    }
    
    public static void managePatients() {
        switch(getCrudAction()) {
            case Create: patients.create();
                         break;
            case Update: patients.update();
                         break;
            case Delete: patients.delete();
                         break;
        }
    }
    
    public static void manageAppointment() {
        switch(getCrudAction()) {
            case Create: appointments.create();
                         break;
            case Update: appointments.update();
                         break;
            case Delete: appointments.delete();
                         break;
        }
    }
    
    public static void manageAppointmentReport() {
        println(secretaries.getAppointmentReport(appointments.list));
    }
    
    public static void manageAggravations() {
    
    }
    
    public static void managePatientRecords() {
    
    }
    
    public static void manageMedicalReport() {
    
    }
    
    public static void showAgain() {
    
    }
    
    /* Mocks */
    
    public static void populate() {
        Doctor d1 = new Doctor();
        d1.setId(1);
        d1.setName("Doctor #" + d1.getId());
        doctors.list.add(d1);
        
        Doctor d2 = new Doctor();
        d2.setId(2);
        d2.setName("Doctor #" + d2.getId());
        doctors.list.add(d2);
        
        Patient p1 = new Patient();
        p1.setId(1);
        p1.setName("Patient #" + p1.getId());
        
        Patient p2 = new Patient();
        p2.setId(2);
        p2.setName("Patient #" + p2.getId());        
        
        Secretary s1 = new Secretary();
        s1.setId(1);
        s1.setName("Secretary #" + s1.getId());
        secretaries.list.add(s1);       
        
        Appointment a1 = new Appointment();
        a1.setAppointmentType(AppointmentType.accompaniment);
        a1.setData(Date.valueOf(LocalDate.now().plusDays(1)));
        a1.setHour(Time.valueOf("13:30:00"));
        a1.setDoctor(d1);
        a1.setPatient(p1);
        appointments.list.add(a1);
        
        Appointment a2 = new Appointment();
        a2.setAppointmentType(AppointmentType.regular);
        a2.setData(Date.valueOf(LocalDate.now().plusDays(2)));
        a2.setHour(Time.valueOf("14:00:00"));
        a2.setDoctor(d2);
        a2.setPatient(p2);
        appointments.list.add(a2);
        
        Appointment a3 = new Appointment();
        a3.setAppointmentType(AppointmentType.regular);
        a3.setData(Date.valueOf(LocalDate.now().plusDays(1)));
        a3.setHour(Time.valueOf("14:00:00"));
        a3.setDoctor(d2);
        a3.setPatient(p2);
        appointments.list.add(a3);
    }
    
    /* Main */
    public static void main(String[] args) {
        populate();
        
        MenuAction action;
        do {
            action = getMenuAction();
            
            switch(action) {
                case Loggin:
                    loggin();
                    break;
                case ManagePatients: 
                    managePatients();
                    break;
                case ManageAppointments:
                    manageAppointment();
                    break;
                case ManageAppointmentReports:
                    manageAppointmentReport();
                    break;
                case ManageAggravations:
                    manageAggravations();
                    break;
                case ManagePatientRecords:
                    managePatientRecords();
                    break;
                case ManageMedicalReports:
                    manageMedicalReport();
                    break;
                case ShowAgain:
                    showAgain();
                    break;
            }            
            
        } while(!action.equals(MenuAction.Exit));
    }
    
}
