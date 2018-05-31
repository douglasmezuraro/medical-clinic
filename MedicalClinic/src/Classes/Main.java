package Classes;

import Boundary.Appointments;
import Boundary.Doctors;
import Boundary.Patients;
import Boundary.Secretaries;
import Entities.Doctor;
import Entities.Secretary;
import java.sql.Date;

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
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("Douglas");
        doctor.setLastName("Mezuraro");
        doctor.setAddress("Avenida Horácio Raccanello");
        doctor.setBirth(Date.valueOf("1996-06-18"));
        doctor.setEmail("douglasmez@gmail.com");
        doctor.setPhone("(44)99947-7765");
        doctors.list.add(doctor);
        
        Secretary secretary = new Secretary();
        secretary.setId(1);
        secretary.setName("Fulano");
        secretary.setLastName("de Tal");
        secretary.setAddress("Avenida Brasil");
        secretary.setBirth(Date.valueOf("1976-02-10"));
        secretary.setEmail("fulanodetal@outlook.com");
        secretary.setPhone("(44)99931-1932");
        secretaries.list.add(secretary);        
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
