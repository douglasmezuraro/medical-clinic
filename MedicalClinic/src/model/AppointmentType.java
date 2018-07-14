package model;

public enum AppointmentType {
    
    regular("Normal (duração de 1 hora)"),
    accompaniment("Retorno (Duração de 30 minutos)");
    
    private String description;
    
    AppointmentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
