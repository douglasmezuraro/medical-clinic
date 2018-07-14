package Boundary;

import java.sql.Date;

import DAO.DoctorsDAO;
import model.Doctor;

public class Main {
 
    public static void main(String[] args) {
        
        Doctor d = new Doctor();
        d.setAddress("Rua toledo, 812");
        d.setBirth(Date.valueOf("1996-06-18"));
        d.setName("Douglas");
        d.setLastName("Mezuraro");
        
        DoctorsDAO dao = new DoctorsDAO();
        dao.connect();
        dao.add(d);
        dao.disconnect();
    }
    
}
