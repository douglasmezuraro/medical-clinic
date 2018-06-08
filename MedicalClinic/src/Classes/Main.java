package Classes;

import Boundary.Crud;
import Entities.Person;

public class Main {
    
    // Constantes
    private static final String sLineBreak = "\n";
    // Objetos utéis
    private static Person logged;
    private static Actor actor = Actor.Undefined;
    private static CustomScanner input = new CustomScanner();
    // Database
    private static DataBase dataBase = new DataBase();

    
    /* Métodos utéis */
    
    public static MenuAction getMenuAction() {
        MenuAction action = MenuAction.ShowAgain;
       
        println(action.toString(actor) + sLineBreak);
        
        int index = input.readInt("Digite o número da opção que deseja:");
        action = MenuAction.values()[index - 1];
        
        if(action.getActor().equals(Actor.Undefined))
            return action;
        
        if(!action.getActor().equals(actor)) { 
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
    
    public static void loggin() {
        println(
            "Identifique-se:" + sLineBreak +
            actor.toString());
        
        int index = input.readInt("");
        actor = Actor.values()[index - 1];
        switch(actor) {
            case Secretary:
                logged = dataBase.getSecretaries().retrieve();
                break;
            case Doctor:
                logged = dataBase.getDoctors().retrieve();
                break;
        }
    }
    
    public static <T extends Crud> void manageCrud(T crud) {
        switch(getCrudAction()) {
            case Create:
                println("ID gerado: " + crud.create());
                break;
            case Retrieve:
                Base object = crud.retrieve();
                if(object != null);
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
                dataBase.getAppointments().list));
    }
    
    public static void sentEmail() {
        String email = input.readString("Digite o e-mail do destinatário:");
        String message = input.readString("Digte a mensagem:");
        Person receiver = dataBase.getPersonByEmail(email);
        logged.getEmail().sentMessage(receiver.getEmail(), message);
    }
    
    public static void sentSMS() {
        String phone = input.readString("Digite o número do destinatário:");
        String message = input.readString("Digite a mensagem: ");
        Person receiver = dataBase.getPersonByPhone(phone);
        logged.getPhone().sentMessage(receiver.getPhone(), message);
    }
    
    public static void manageMedicalReport() {
        new Exception("Não implementado!");
    }
    
    public static void showAgain() {
        new Exception("Não implementado!");
    }

    /* Main */
    public static void main(String[] args) {
        dataBase.Populate();
        
        MenuAction action;
        do {
            action = getMenuAction();
            
            switch(action) {
                case Loggin:
                    loggin();
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
