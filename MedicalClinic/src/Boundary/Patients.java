package Boundary;

import Entities.AgreementType;
import Entities.Patient;

public class Patients extends Cadastrable<Patient> {
    
    protected void addOrUpdate(Patient patient) {
        if(patient.getId() > 0) {
            System.out.println("Digite o id:");
            patient.setId(Integer.parseInt(input.nextLine()));
        }
        
        System.out.println("Digite o nome:");
        patient.setName(input.nextLine());
        
        System.out.println("Digite o último nome:");
        patient.setLastName(input.nextLine());
        
        // TODO : Ver como faz o parse de 'String' pra 'Date'       
        //System.out.println("Digite o nascimento:");
        //s.setBirth(input.nextLine());
        
        System.out.println("Digite o endereço:");
        patient.setAddress(input.nextLine());
        
        System.out.println("Digite o contato:");
        patient.setContact(input.nextLine());
        
        System.out.println("Digite o e-mail:");
        patient.setEmail(input.nextLine());
        
        System.out.println("Digite o telefone:");
        patient.setPhone(input.nextLine());
        
//        System.out.println("Digite o tipo de convênio:");
//        String s = input.nextLine().toUpperCase(); 
//        patient.setAgreementType(AgreementType.valueOf(s));
        
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
