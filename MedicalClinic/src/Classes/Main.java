package Classes;

import Boundary.Patients;
import java.util.Scanner;

public class Main {
       
    private static Scanner input = new Scanner(System.in);
    private static Patients patients = new Patients();
    
    private enum MenuAction {
        ManagePatients(Actor.Secretary, "Gerenciar pacientes"),
        ManageAppointments(Actor.Secretary, "Gerenciar consultas"),
        ManageAppointmentReports(Actor.Secretary, "Gerenciar relatórios de consultas"),
        ManageAggravations(Actor.Doctor, "Gerenciar agravamentos"),
        ManagePatientRecords(Actor.Doctor, "Gerenciar prontuários de pacients"),
        ManageMedicalReports(Actor.Doctor, "Gerenciar relatórios médicos"),
        Exit(Actor.Both, "Sair");
        
        private Actor actor;
        private String description;
        
        MenuAction(Actor actor, String description) {
            this.actor = actor;
            this.description = description;
        }
    };
    
    private enum CadastrableAction {
        
        Create("Cadastrar"),
        Update("Atualizar"),
        Delete("Deletar");
        
        private String description;
        
        CadastrableAction(String description) {
            this.description = description;
        }
    }
    
    private enum Actor {
        Both,
        Secretary,
        Doctor;
    }
    
    public static void printMenuActions() {
        for(MenuAction m: MenuAction.values())
            System.out.println((m.ordinal() + 1) + " - " + m.description);
    }
    
    public static void printCadastrableActions() {
        for(CadastrableAction c: CadastrableAction.values())
            System.out.println((c.ordinal() + 1) + " - " + c.description);
    }
    
    public static MenuAction getMenuAction() {
        printMenuActions();
        System.out.println("Digite o número da opção que deseja:");
        
        int index = Integer.parseInt(input.nextLine());
        return MenuAction.values()[index - 1];
    }
    
    public static CadastrableAction getCadastrableAction() {
        printCadastrableActions();
        System.out.println("Digite o número da opção que deseja:");
        int index = Integer.parseInt(input.nextLine());
        return CadastrableAction.values()[index - 1];
    }
    
    public static void managePatients() {
        CadastrableAction cadastrableAction = getCadastrableAction();
        
        switch(cadastrableAction) {
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
