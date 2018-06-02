package Boundary;

import Entities.PatientRecord;

public class PatientRecords extends Crud<PatientRecord> {
    
    public PatientRecords() {
        description = "prontuário do paciente";
    }
    
    @Override
    public int create() {
        return createOrUpdate(new PatientRecord());
    }
    
    @Override
    public int createOrUpdate(PatientRecord object) {
        object.setSymptoms(input.readString("Digite os sintomas:"));
        object.setDiagnosis(input.readString("Digite o diagnóstico:"));
        object.setTreatmentPrescription(input.readString("Digite a prescrição médica:"));
        
        return super.add(object);
    }
     
}
