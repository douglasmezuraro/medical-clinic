package Boundary;

import Entities.AgreementType;
import Entities.Patient;
import java.sql.Date;

public class Patients extends Cadastrable<Patient> {
    
    protected void addOrUpdate(Patient patient) {
        if(patient.getId() == 0) {
            System.out.println("Digite o id:");
            patient.setId(Integer.parseInt(input.nextLine()));
        }
        
        System.out.println("Digite o nome:");
        patient.setName(input.nextLine());
        
        System.out.println("Digite o último nome:");
        patient.setLastName(input.nextLine());
           
        System.out.println("Digite o nascimento (yyyy-mm-dd):");
        patient.setBirth(Date.valueOf(input.nextLine()));
        
        System.out.println("Digite o endereço:");
        patient.setAddress(input.nextLine());
        
        System.out.println("Digite o contato:");
        patient.setContact(input.nextLine());
        
        System.out.println("Digite o e-mail:");
        patient.setEmail(input.nextLine());
        
        System.out.println("Digite o telefone:");
        patient.setPhone(input.nextLine());
        
        System.out.println("Digite o tipo de convênio (1 - Particular / 2 - Plano de saúde):");
        patient.setAgreementType(AgreementType.values()[Integer.parseInt(input.nextLine())]);
        
        if(!list.contains(patient))
            list.add(patient);
    }
    
    public void create() {
        addOrUpdate(new Patient());
    }    
    
    public Patient retrieve() {
        System.out.println("Digite o id:");
        int id = Integer.parseInt(input.nextLine());
        return retrieve(id);
    }
    
    public void update() {
        Patient patient = retrieve();
        addOrUpdate(patient);
    } 
    
    public void delete() {
        Patient patient = retrieve();
        delete(patient);
    }
}
