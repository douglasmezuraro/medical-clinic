package Classes;

import Boundary.Patients;
import java.util.Scanner;

public class Main {
       
    private static Actor actor = Actor.Undefined;
    private static CustomScanner input = new CustomScanner();
    private static Patients patients = new Patients();
    private static final String sLineBreak = "\n";
    
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
        CrudAction action = getCrudAction();
        
        switch(action) {
            case Create:
                patients.create();
                break;
            case Update:
                patients.update();
                break;
            case Delete:
                patients.delete();
                break;
        }
    }
    
    public static void manageAppointment() {
    
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
    
    /* Main */
    
    public static void main(String[] args) {
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
