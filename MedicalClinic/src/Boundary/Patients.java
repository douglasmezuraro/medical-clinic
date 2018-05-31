package Boundary;

import Entities.AgreementType;
import Entities.Patient;
import java.sql.Date;
import java.lang.Exception;

public class Patients extends Crud<Patient> {

    @Override
    protected void createOrUpdate(Patient patient) {

        boolean validValue = false;

        if (patient.getId() == 0) {
            while (!validValue) {
                System.out.println("Digite o id (somente números:");
                try {
                    patient.setId(Integer.parseInt(input.nextLine()));
                    validValue = true;
                } catch (Exception ex) {
                    System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                    validValue = false;
                }
            }
        }

        validValue = false;
        System.out.println("Digite o nome:");
        while (!validValue) {
            try {
                patient.setName(input.nextLine());
                validValue = true;

            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = false;
            }
        }

        validValue = false;
        System.out.println("Digite o último nome:");
        while (!validValue) {
            try {
                patient.setLastName(input.nextLine());
                validValue = true;
            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = false;
            }
        }

        validValue = false;
        System.out.println("Digite o nascimento (yyyy-mm-dd):");
        while (!validValue) {
            try {
                patient.setBirth(Date.valueOf(input.nextLine()));
                validValue = true;
            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = true;
            }
        }
        validValue = false;
        System.out.println("Digite o endereço:");
        while (!validValue) {
            try {
                patient.setAddress(input.nextLine());
                validValue = true;
            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = false;
            }
        }

        validValue = false;
        System.out.println("Digite o contato:");
        while (!validValue) {
            try {
                patient.setContact(input.nextLine());
                validValue = true;
            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = false;
            }
        }

        validValue = false;
        while (!validValue) {
            System.out.println("Digite o e-mail:");
            try {
                patient.setEmail(input.nextLine());
                validValue = true;

            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = false;
            }
        }

        validValue = false;
        System.out.println("Digite o telefone:");
        while (!validValue) {
            try {
                patient.setPhone(input.nextLine());
                validValue = true;
            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = false;
            }
        }

        validValue = false; 
        System.out.println("Digite o tipo de convênio (1 - Particular / 2 - Plano de saúde):");
        while (!validValue) {
            try {
                patient.setAgreementType(AgreementType.values()[Integer.parseInt(input.nextLine())]);
                validValue = false;
            } catch (Exception ex) {
                System.out.println("ERRO" + ex + "  !!!  Digite um valor válido!!! ");
                validValue = true;
            }
        }

        if (!list.contains(patient)) {
            list.add(patient);
        }
    }

    @Override
    public void create() {
        createOrUpdate(new Patient());
    }
}
