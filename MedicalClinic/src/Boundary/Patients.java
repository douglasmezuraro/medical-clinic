package Boundary;

import Entities.AgreementType;
import Entities.Patient;

public class Patients extends Crud<Patient> {

    public Patients() {
        description = "paciente";
    }
    
    @Override
    protected void createOrUpdate(Patient object) {
        if(object.getId() > 0)
            object.setId(input.readInt("Digite o id:"));

        object.setName(input.readString("Digite o nome:"));
        object.setLastName(input.readString("Digite o último nome:"));
        object.setBirth(input.readDate("Digite o nascimento (dd/mm/aaaa):"));
        object.setAddress(input.readString("Digite o endereço:"));
        object.setContact(input.readString("Digite o contato:"));
        object.setEmail(input.readString("Digite o e-mail:"));
        object.setPhone(input.readString("Digite o telefone:"));        
        object.setAgreementType(AgreementType.values()[input.readInt("Digite o tipo de convênio (1 - Particular / 2 - Plano de saúde):") - 1]);

        super.add(object);
    }

    @Override
    public void create() {
        createOrUpdate(new Patient());
    }
}
