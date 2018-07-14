package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Base;

public class DAO<T extends Base> implements IDAO<T> {

    private EntityManagerFactory emf;
    private EntityManager em;
    private final Class<T> model;
    
    protected DAO(Class<T> model) {
        this.model = model;
    }
    
    @Override
    public void connect() {
        emf = Persistence.createEntityManagerFactory("MedicalClinicPU");
        em = emf.createEntityManager();
    }

    @Override
    public void disconnect() {
        em.close();
        emf.close();
    }

    @Override
    public void add(T model) {
        em.getTransaction().begin();
        em.persist(model);
        em.flush();
        em.getTransaction().commit(); 
    }

    @Override
    public void update(T model) {
        em.getTransaction().begin();
        em.merge(model);
        em.flush();
        em.getTransaction().commit();
    }

    @Override
    public void remove(T model) {
        em.getTransaction().begin();
        em.remove(model);
        em.flush();
        em.getTransaction().commit();
    }

    @Override
    public T find(Integer id) {
        return em.find(model, id);
    }
    
}
