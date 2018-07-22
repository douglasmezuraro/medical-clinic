package Utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class EntityManagerSingleton {
    
    private static EntityManagerSingleton instance;
        
    @PersistenceContext
    private final EntityManager entityManager;
    
    private EntityManagerSingleton() {
        entityManager = Persistence.createEntityManagerFactory("MedicalClinicPU").createEntityManager();
    }
    
    public static EntityManagerSingleton getInstance() {
        if(instance == null) {
            instance = new EntityManagerSingleton();
            
        }
        return instance;
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
     
}
