package Classes;

public enum PersonType {
    
    Undefined("Indefinido"),
    Secretary("Secretário"),
    Doctor("Médico");
    
    private String description;
    
    PersonType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        String value = "";
        for(PersonType actor: PersonType.values()) {
            if(!value.isEmpty()) 
                value = value + "\n";
            value = value + (actor.ordinal() + 1) + " - " + actor.description;
        }
        return value;
    }
}
