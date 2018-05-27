package Boundary;

import Entities.Doctor;
import java.sql.Date;

public class Doctors extends Cadastrable<Doctor> {
   
    protected void addOrUpdate(Doctor doctor) {
        if(doctor.getId() > 0) {
            System.out.println("Digite o id:");
            doctor.setId(Integer.parseInt(input.nextLine()));
        }
        
        System.out.println("Digite o nome:");
        doctor.setName(input.nextLine());
        
        System.out.println("Digite o último nome:");
        doctor.setLastName(input.nextLine());
        
        System.out.println("Digite o nascimento (yyyy-mm-dd):");
        doctor.setBirth(Date.valueOf(input.nextLine()));
        
        System.out.println("Digite o endereço:");
        doctor.setAddress(input.nextLine());
        
        System.out.println("Digite o contato:");
        doctor.setContact(input.nextLine());
        
        System.out.println("Digite o e-mail:");
        doctor.setEmail(input.nextLine());
        
        System.out.println("Digite o telefone:");
        doctor.setPhone(input.nextLine());
        
        if(!list.contains(doctor))
            list.add(doctor);
    }
    
    public void create() {
        addOrUpdate(new Doctor());
    }    
    
    public Doctor retrive() {
        System.out.println("Digite o id:");
        int id = Integer.parseInt(input.nextLine());
        return retrieve(id);
    }
    
    public void update(Doctor doctor ){
        addOrUpdate(doctor);
    } 
    
}
