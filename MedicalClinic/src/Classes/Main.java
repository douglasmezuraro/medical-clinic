package Classes;

import Boundary.Patients;
import java.util.Scanner;

public class Main {
       
    private static Scanner input = new Scanner(System.in);
    private static Patients patients = new Patients();
    private static String sLineBreak = "\n";
     
    public static MenuAction getMenuAction() {
        MenuAction action = MenuAction.Exit;
       
        System.out.println(
                action.toString() + 
                sLineBreak + 
                " Digite o número da opção que deseja:");
        
        int index = Integer.parseInt(input.nextLine());
        return MenuAction.values()[index - 1];
    }
    
    public static CrudAction getCrudAction() {
        CrudAction action = CrudAction.Retrieve;
        
        System.out.println(
                action.toString() +
                sLineBreak +
                "Digite o número da opção que deseja:");
        
        int index = Integer.parseInt(input.nextLine());
        return CrudAction.values()[index - 1];
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
    
    public static void main(String[] args) {
        MenuAction menuAction;
        do {
            menuAction = getMenuAction();
            
            switch(menuAction) {
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
            }            
            
        } while(menuAction != MenuAction.Exit);
    }
    
}
