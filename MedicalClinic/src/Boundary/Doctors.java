package Boundary;

import Entities.Doctor;

public class Doctors extends Crud<Doctor> {
   
    @Override
    protected void createOrUpdate(Doctor object) {
        if(object.getId() > 0)
            object.setId(input.readInt("Digite o id:"));

        object.setName(input.readString("Digite o nome:"));
        object.setLastName(input.readString("Digite o último nome:"));
        object.setBirth(input.readDate("Digite o nascimento (yyyy-mm-dd):"));
        object.setAddress(input.readString("Digite o endereço:"));
        object.setContact(input.readString("Digite o contato:"));
        object.setEmail(input.readString("Digite o e-mail:"));
        object.setPhone(input.readString("Digite o telefone:"));
        
        super.add(object);
    }
    
    @Override
    public void create() {
        createOrUpdate(new Doctor());
    }
}
