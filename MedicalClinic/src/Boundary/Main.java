package Boundary;

import Utils.*;
import Cruds.Crud;
import Entities.Base;
import Entities.Person;
import java.util.Arrays;

public class Main {
    
    // Constantes
    private static final String sLineBreak = "\n";
    // Objetos utéis
    private static Person loggedPerson;
    private static PersonType loggedPersonType = PersonType.Undefined;
    private static CustomScanner input = new CustomScanner();
    // Database
    private static DataBase dataBase = new DataBase();

    
    /* Métodos utéis */
    
    public static MenuAction getMenuAction() {
        MenuAction action = MenuAction.ShowAgain;
       
        println(action.toString(loggedPersonType) + sLineBreak);
        
        int index = input.readInt("Digite o número da opção que deseja:");
        action = MenuAction.values()[index - 1];
        
        if(Arrays.equals(action.getPersonType(),PersonType.values())){
            return action;
        }
        
        if(!Arrays.asList(action.getPersonType()).contains(loggedPersonType)) { 
            println("Ação não permitida!");
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
        for(int i = 0; i <= 75; i++)
            System.out.print("*");
        System.out.println("");
        System.out.println(string);
    }
    
    /* Ações principais */
    
    public static void login() {
        int index = input.readInt("Identifique-se:" + sLineBreak + loggedPersonType.toString());
        
        loggedPersonType = PersonType.values()[index - 1];
       
        switch(loggedPersonType) {
            case Secretary:
                loggedPerson = dataBase.getSecretaries().retrieve();
                break;
            case Doctor:
                loggedPerson = dataBase.getDoctors().retrieve();
                break;
        }
        
        if(loggedPersonType == PersonType.Undefined)
            return;
        
        if(loggedPerson == null) {
            loggedPersonType = PersonType.Undefined;
            println("Id não encontrado, tente novamente!");
        }
    }
    
    public static <T extends Crud> void manageCrud(T crud) {
        switch(getCrudAction()) {
            case Create:
                println(String.format("ID gerado: %d", crud.create()));
                break;
            case Retrieve:
                Base object = crud.retrieve();
                
                if(object != null)
                    println(object.toString());
                
                break;
            case Update:
                crud.update();
                break;
            case Delete:
                crud.delete();
                break;
        }
    }
    
    public static void manageAppointmentReport() {
        println(dataBase.getSecretaries().getAppointmentReport(
                dataBase.getAppointments().getList()));
    }
    
    public static void sentEmail() {
        String email = input.readString("Digite o e-mail do destinatário:");
        String message = input.readString("Digte a mensagem:");
        Person receiver = dataBase.getPersonByEmail(email);
        
        if(receiver == null) {
            println("E-mail do destinatário não encontrado");
            return;
        }
        
        loggedPerson.getEmail().newMessage(receiver.getEmail(), message);
    }
    
    public static void sentSMS() {
        String phone = input.readString("Digite o número do destinatário:");
        String message = input.readString("Digite a mensagem: ");
        Person receiver = dataBase.getPersonByPhone(phone);
        
        if(receiver == null) {
            println("Telefone do destinatário não encontrado");
            return;
        }
        
        loggedPerson.getPhone().newMessage(receiver.getPhone(), message);
    }
    
    public static void manageMedicalReport() {
        new Exception("Não implementado!");
    }
    
    public static void showAgain() {
       
    }

    /* Main */
    public static void main(String[] args) {
        dataBase.Populate();
        
        MenuAction action;
        do {
            action = getMenuAction();
            
            switch(action) {
                case Login:
                    login();
                    break;
                 case ManageSecretaries: 
                    manageCrud(dataBase.getSecretaries());
                    break;
                case ManageDoctors:
                    manageCrud(dataBase.getDoctors());
                    break;    
                case ManagePatients: 
                    manageCrud(dataBase.getPatients());
                    break;
                case ManageAppointments:
                    manageCrud(dataBase.getAppointments());
                    break;
                case ManageAppointmentReports:
                    manageAppointmentReport();
                    break;
                case ManageAggravations:
                    //manageCrud(aggravations);
                    break;
                case ManagePatientRecords:
                    manageCrud(dataBase.getPatientRecords());
                    break;
                case ManageMedicalReports:
                    manageMedicalReport();
                    break;
                case SentEmail:
                    sentEmail();
                    break;
                case SentSMS:
                    sentSMS();
                    break;
                case ShowAgain:
                    showAgain();
                    break;
            }            
            
        } while(!action.equals(MenuAction.Exit));
    }
    
}
