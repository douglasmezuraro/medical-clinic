package Cruds;

import Entities.AgreementType;
import Entities.Patient;

public class Patients extends Crud<Patient> {

    public Patients() {
        description = "paciente";
    }
    
    @Override
    public int create() {
        return createOrUpdate(new Patient());
    }
    
    @Override
    protected int createOrUpdate(Patient object) {
        object.setName(input.readString("Digite o nome:"));
        object.setLastName(input.readString("Digite o último nome:"));
        object.setBirth(input.readDate("Digite o nascimento (dd/mm/aaaa):"));
        object.setAddress(input.readString("Digite o endereço:"));
        object.setContact(input.readString("Digite o contato:"));
        object.getEmail().setAddress(input.readString("Digite o e-mail:"));
        object.getPhone().setNumber(input.readString("Digite o telefone:"));        
        object.setAgreementType(AgreementType.values()[input.readInt("Digite o tipo de convênio (1 - Particular / 2 - Plano de saúde):") - 1]);

        return super.add(object);
    }
    
}
