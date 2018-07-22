package DAO;

import Actors.Doctor;

public class DoctorsDAO extends DAO<Doctor> {
    
    public DoctorsDAO() {
        super(Doctor.class);
    } 
    
    @Override
    public void seed() {}
    
}
