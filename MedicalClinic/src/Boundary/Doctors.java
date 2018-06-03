package Boundary;

import Entities.Doctor;

public class Doctors extends Crud<Doctor> {
   
    public Doctors() {
        description = "médico(a)";
    }
    
    @Override
    public int create() {
        return createOrUpdate(new Doctor());
    }
    
    @Override
    protected int createOrUpdate(Doctor object) {
        object.setName(input.readString("Digite o nome:"));
        object.setLastName(input.readString("Digite o último nome:"));
        object.setBirth(input.readDate("Digite o nascimento (dd/mm/aaaa):"));
        object.setAddress(input.readString("Digite o endereço:"));
        object.setContact(input.readString("Digite o contato:"));
        object.getEmail().setAddress(input.readString("Digite o e-mail:"));
        object.getPhone().setNumber(input.readString("Digite o telefone:"));
        
        return super.add(object);
    }
    
}
