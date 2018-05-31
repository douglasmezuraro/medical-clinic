package Classes;

public enum MenuAction {
    
    ManagePatients("Gerenciar pacientes"),
    ManageAppointments("Gerenciar consultas"),
    ManageAppointmentReports("Gerenciar relatórios de consultas"),
    ManageAggravations("Gerenciar agravamentos"),
    ManagePatientRecords("Gerenciar prontuários de pacients"),
    ManageMedicalReports("Gerenciar relatórios médicos"),
    Exit("Sair");

    private String description;

    MenuAction(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        String value = "";
        for(MenuAction action: MenuAction.values()) {
            if(!value.isEmpty()) 
                value = value + "\n";
            value = value + (action.ordinal() + 1) + " - " + action.description;
        }
        return value;
    }
    
};