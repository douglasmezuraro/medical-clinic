package Boundary;

import Entities.Doctor;
import java.sql.Date;

public class Doctors extends Crud<Doctor> {
   
    @Override
    protected void createOrUpdate(Doctor object) {
        if(object.getId() > 0) {
            System.out.println("Digite o id:");
            object.setId(Integer.parseInt(input.nextLine()));
        }
        
        System.out.println("Digite o nome:");
        object.setName(input.nextLine());
        
        System.out.println("Digite o último nome:");
        object.setLastName(input.nextLine());
        
        System.out.println("Digite o nascimento (yyyy-mm-dd):");
        object.setBirth(Date.valueOf(input.nextLine()));
        
        System.out.println("Digite o endereço:");
        object.setAddress(input.nextLine());
        
        System.out.println("Digite o contato:");
        object.setContact(input.nextLine());
        
        System.out.println("Digite o e-mail:");
        object.setEmail(input.nextLine());
        
        System.out.println("Digite o telefone:");
        object.setPhone(input.nextLine());
        
        super.add(object);
    }
    
    @Override
    public void create() {
        createOrUpdate(new Doctor());
    }
}
