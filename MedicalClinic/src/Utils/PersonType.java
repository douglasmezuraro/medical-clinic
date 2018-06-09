package Utils;

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
        
        for(PersonType personType: PersonType.values()) {
            if(!value.isEmpty()) 
                value += "\n";
            value += String.format("[%d] %s", (personType.ordinal() + 1), personType.description);
        }
        
        return value;
    }
}
