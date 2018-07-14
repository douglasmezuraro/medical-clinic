package Boundary;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Doctor;

public class Main {
 
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MedicalClinicPU");
        EntityManager em = emf.createEntityManager();
        
        try {
            Doctor d = new Doctor();
            d.setAddress("Rua toledo, 812");
            d.setBirth(Date.valueOf("1996-06-18"));
            d.setName("Douglas");
            d.setLastName("Mezuraro");
            
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
            
        } finally {
            em.close();
            emf.close();
        }
           
    }
    
}
