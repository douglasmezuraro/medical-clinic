package Classes;

public enum MenuAction {
    Loggin("Logar", PersonType.Undefined),
    ManagePatients("Gerenciar pacientes", PersonType.Secretary),
    ManageAppointments("Gerenciar consultas", PersonType.Secretary),
    ManageAppointmentReports("Gerenciar relatórios de consultas", PersonType.Secretary),
    ManageAggravations("Gerenciar agravamentos", PersonType.Doctor),
    ManagePatientRecords("Gerenciar prontuários de pacients", PersonType.Doctor),
    ManageMedicalReports("Gerenciar relatórios médicos", PersonType.Doctor),
    SentEmail("Enviar e-mails", PersonType.Undefined),
    SentSMS("Enviar SMS", PersonType.Undefined),
    ShowAgain("Mostrar novamente", PersonType.Undefined),
    Exit("Sair", PersonType.Undefined);

    private String description;
    private PersonType actor;

    MenuAction(String description, PersonType actor) {
        this.description = description;
        this.actor = actor;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PersonType getPersonType() {
        return actor;
    }

    public void setPersonType(PersonType actor) {
        this.actor = actor;
    }
    
    public String toString(PersonType actor) {
        String value = "";
        for(MenuAction action: MenuAction.values()) {
            if(action.actor.equals(actor) || action.actor.equals(PersonType.Undefined)) {
                if(!value.isEmpty()) 
                    value = value + "\n";
                value = value + (action.ordinal() + 1) + " - " + action.description;
            }
        }
        return value;
    }
    
};