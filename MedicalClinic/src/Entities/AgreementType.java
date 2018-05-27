package Entities;

public enum AgreementType {
      
    particular("PARTICULAR"),
    healthInsurance("PLANO DE SAUDE");
    
    private String description;
    
    AgreementType(String description) {
        this.description = description;
    } 
    
}
