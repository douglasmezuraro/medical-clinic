package Classes;

public enum MenuAction {
    Loggin("Logar", Actor.Undefined),
    ManagePatients("Gerenciar pacientes", Actor.Secretary),
    ManageAppointments("Gerenciar consultas", Actor.Secretary),
    ManageAppointmentReports("Gerenciar relatórios de consultas", Actor.Secretary),
    ManageAggravations("Gerenciar agravamentos", Actor.Doctor),
    ManagePatientRecords("Gerenciar prontuários de pacients", Actor.Doctor),
    ManageMedicalReports("Gerenciar relatórios médicos", Actor.Doctor),
    SentEmail("Enviar e-mails", Actor.Undefined),
    SentSMS("Enviar SMS", Actor.Undefined),
    ShowAgain("Mostrar novamente", Actor.Undefined),
    Exit("Sair", Actor.Undefined);

    private String description;
    private Actor actor;

    MenuAction(String description, Actor actor) {
        this.description = description;
        this.actor = actor;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public String toString(Actor actor) {
        String value = "";
        for(MenuAction action: MenuAction.values()) {
            if(action.actor.equals(actor) || action.actor.equals(Actor.Undefined)) {
                if(!value.isEmpty()) 
                    value = value + "\n";
                value = value + (action.ordinal() + 1) + " - " + action.description;
            }
        }
        return value;
    }
    
};