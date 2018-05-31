package Boundary;

import Entities.Secretary;
import java.sql.Date;

public class Secretaries extends Crud<Secretary> {

    @Override
    public void createOrUpdate(Secretary secretary) {
        if(secretary.getId() > 0) {
            System.out.println("Digite o id:");
            secretary.setId(Integer.parseInt(input.nextLine()));
        }
        
        System.out.println("Digite o nome:");
        secretary.setName(input.nextLine());
        
        System.out.println("Digite o último nome:");
        secretary.setLastName(input.nextLine());
        
        System.out.println("Digite o nascimento (yyyy-mm-dd):");
        secretary.setBirth(Date.valueOf(input.nextLine()));
        
        System.out.println("Digite o endereço:");
        secretary.setAddress(input.nextLine());
        
        System.out.println("Digite o contato:");
        secretary.setContact(input.nextLine());
        
        System.out.println("Digite o e-mail:");
        secretary.setEmail(input.nextLine());
        
        System.out.println("Digite o telefone:");
        secretary.setPhone(input.nextLine());
        
        if(!list.contains(secretary))
            list.add(secretary);
    }
    
    @Override
    public void create() {
        createOrUpdate(new Secretary());
    }    
      
}
