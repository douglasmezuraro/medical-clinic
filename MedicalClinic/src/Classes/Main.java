package Classes;

import Boundary.Patients;
import java.util.Scanner;

public class Main {
       
    private static Scanner input = new Scanner(System.in);
    private static Patients patients = new Patients();
    
    private enum Menu {
        ManagePatients("Gerenciar pacientes"),
        ManageAppointment("Gerenciar consultas"),
        ManageAppointmentReport("Gerenciar relatórios de consultas"),
        ManagePatientRecords("Gerenciar prontuários de pacients"),
        ManageMedicalReport("Gerenciar relatórios médicos");
        
        private String description;
        
        Menu(String description) {
            this.description = description;
        }
    };
    
    private enum CRUD {
        
        Create("Cadastrar"),
        Update("Atualizar"),
        Delete("Deletar");
        
        private String description;
        
        CRUD(String description) {
            this.description = description;
        }
    }
    
    public static void printMenu() {
        for(Menu menu: Menu.values())
            System.out.println((menu.ordinal() + 1) + " - " + menu.description);
    }
    
    public static void printCRUD() {
        for(CRUD crud: CRUD.values())
            System.out.println((crud.ordinal() + 1) + " - " + crud.description);
    }
    
    public static Menu getMenu() {
        printMenu();
        System.out.println("Digite o número da opção que deseja:");
        
        int index = Integer.parseInt(input.nextLine());
        return Menu.values()[index - 1];
    }
    
    public static CRUD getCRUD() {
        printCRUD();
        System.out.println("Digite o número da opção que deseja:");
        int index = Integer.parseInt(input.nextLine());
        return CRUD.values()[index - 1];
    }
    
    public static void managePatients() {
        CRUD crud = getCRUD();
        
        switch(crud) {
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
    
    public static void managePatientRecords() {
    
    }
    
    public static void manageMedicalReport() {
    
    }
    
    public static void main(String[] args) {
        Menu menu = getMenu();
        switch(menu) {
            case ManagePatients: 
                managePatients();
                break;
            case ManageAppointment:
                manageAppointment();
                break;
            case ManageAppointmentReport:
                manageAppointmentReport();
                break;
            case ManagePatientRecords:
                managePatientRecords();
                break;
            case ManageMedicalReport:
                manageMedicalReport();
                break;
        }
    }
    
}
