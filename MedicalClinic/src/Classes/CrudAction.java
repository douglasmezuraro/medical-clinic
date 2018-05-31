package Classes;

public enum CrudAction {
   
    Create("cadastrar"),
    Retrieve("consultar"),
    Update("atualizar"),
    Delete("deletar");

    private String description;

    CrudAction(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        String value = "";
        for(CrudAction action: CrudAction.values()) {
            if(!value.isEmpty()) 
                value = value + "\n";
            value = value + (action.ordinal() + 1) + " - " + action.description;
        }
        return value;
    }    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
