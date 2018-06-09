package Cruds;

import Entities.Appointment;
import Entities.Secretary;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Secretaries extends Crud<Secretary> {
    
    public Secretaries() {
        description = "secretário(a)";
    }

    @Override
    public int create() {
        return createOrUpdate(new Secretary());
    }    
    
    @Override
    public int createOrUpdate(Secretary object) {
        object.setName(input.readString("Digite o nome:"));
        object.setLastName(input.readString("Digite o último nome:"));
        object.setBirth(input.readDate("Digite o nascimento (dd/mm/aaaa):"));
        object.setAddress(input.readString("Digite o endereço:"));
        object.setContact(input.readString("Digite o contato:"));
        object.getEmail().setAddress(input.readString("Digite o e-mail:"));
        object.getPhone().setNumber(input.readString("Digite o telefone:"));
        
        return super.add(object);
    }
    
    public String getAppointmentReport(List<Appointment> appointents) {
        
        String report = "";
        boolean hasEmail = input.readBoolean("Filtrar apenas quem tem e-mail?");
        boolean hasPhone = input.readBoolean("Filtrar apenas quem tem celular?");
        
        for(Appointment appointment: appointents) {
            Date tomorrow = Date.valueOf(LocalDate.now().plusDays(1));
            
            if(appointment.getData().compareTo(tomorrow) != 0)
                continue;
           
            if(hasEmail && appointment.getPatient().getEmail().getAddress().isEmpty())
                continue;
            
            if(hasPhone && appointment.getPatient().getPhone().getNumber().isEmpty())
                continue;
                
            report = String.format(
                "Data: %tD; Hora: %tR; Médico(a): %s; Paciente: %s ; Tipo da consulta: %s;\n", 
                appointment.getData(),
                appointment.getHour(),
                appointment.getDoctor().getName(),
                appointment.getPatient().getName(),
                appointment.getAppointmentType().getDescription());           
        }
        
        return report.toUpperCase();
    }
    
}
