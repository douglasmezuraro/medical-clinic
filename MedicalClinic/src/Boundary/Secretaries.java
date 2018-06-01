package Boundary;

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
    public void createOrUpdate(Secretary object) {
        if(object.getId() > 0) 
            object.setId(input.readInt("Digite o id:"));

        object.setName(input.readString("Digite o nome:"));
        object.setLastName(input.readString("Digite o último nome:"));
        object.setBirth(input.readDate("Digite o nascimento (dd/mm/aaaa):"));
        object.setAddress(input.readString("Digite o endereço:"));
        object.setContact(input.readString("Digite o contato:"));
        object.setEmail(input.readString("Digite o e-mail:"));
        object.setPhone(input.readString("Digite o telefone:"));
        
        super.add(object);
    }
    
    @Override
    public void create() {
        createOrUpdate(new Secretary());
    }    
    
    public String getAppointmentReport(List<Appointment> appointents) {
        String report = "";
        
        for(Appointment a: appointents) {
            Date tomorrow = Date.valueOf(LocalDate.now().plusDays(1));
    
            if(a.getData().compareTo(tomorrow) == 0) {
                report += "Data: " + a.getData() + ";" +
                          "Hora: " + a.getHour() + "; " +
                          "Médico(a): " + a.getDoctor().getName() + "; " +
                          "Paciente:" + a.getPatient().getName() + ";" +
                          "Tipo da consulta" + a.getAppointmentType().getDescription() + ";" + "\n";
            }
            
        }
        
        return report.toUpperCase();
    }
    
}
