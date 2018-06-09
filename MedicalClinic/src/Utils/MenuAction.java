package Utils;

import java.util.Arrays;

public enum MenuAction {
    Login("Logar", PersonType.values()),
    ManageSecretaries("Gerenciar secretários(as)", PersonType.values()),
    ManageDoctors("Gerenciar médicos(as)", PersonType.values()),
    ManagePatients("Gerenciar pacientes", new PersonType[]{PersonType.Secretary}),
    ManageAppointments("Gerenciar consultas", new PersonType[]{PersonType.Secretary}),
    ManageAppointmentReports("Gerenciar relatórios de consultas", new PersonType[]{PersonType.Secretary}),
    ManageAggravations("Gerenciar agravamentos", new PersonType[]{PersonType.Doctor}),
    ManagePatientRecords("Gerenciar prontuários de pacients", new PersonType[]{PersonType.Doctor}),
    ManageMedicalReports("Gerenciar relatórios médicos", new PersonType[]{PersonType.Doctor}),
    SentEmail("Enviar e-mails", new PersonType[]{PersonType.Secretary, PersonType.Doctor}),
    SentSMS("Enviar SMS", new PersonType[]{PersonType.Secretary, PersonType.Doctor}),
    ShowAgain("Mostrar novamente", PersonType.values()),
    Exit("Sair", PersonType.values());

    private String description;
    private PersonType[] personTypes;

    MenuAction(String description, PersonType[] personTypes) {
        this.description = description;
        this.personTypes = personTypes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PersonType[] getPersonType() {
        return personTypes;
    }

    public void setPersonType(PersonType[] personType) {
        this.personTypes = personType;
    }

    public String toString(PersonType personType) {
        String value = "";
        
        for(MenuAction action : MenuAction.values()) {
            if(Arrays.asList(action.personTypes).contains(personType)) {
                if(!value.isEmpty()) 
                    value += "\n";
                
                value += String.format("[%d] %s", (action.ordinal() + 1), action.description);
            }
        }
        
        return value;
    }

};
