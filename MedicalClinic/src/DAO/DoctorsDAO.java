package DAO;

import Model.Doctor;

public class DoctorsDAO extends DAO<Doctor> {
    
    public DoctorsDAO() {
        super(Doctor.class);
    } 
    
    @Override
    public void seed() {
        if(!this.isEmpty()) return;
        Doctor model = new Doctor();
        model.setName("Médico");
        this.add(model);
    }
    
}
