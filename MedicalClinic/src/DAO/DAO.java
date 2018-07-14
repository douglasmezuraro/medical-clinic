package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Base;

public class DAO<T extends Base> implements IDAO<T> {

    private EntityManagerFactory factory;
    private EntityManager manager;
    private final Class<T> model;
    
    protected DAO(Class<T> model) {
        this.model = model;
    }
    
    @Override
    public void connect() {
        factory = Persistence.createEntityManagerFactory("MedicalClinicPU");
        manager = factory.createEntityManager();
    }

    @Override
    public void disconnect() {
        manager.close();
        factory.close();
    }

    @Override
    public void add(T model) {
        manager.getTransaction().begin();
        manager.persist(model);
        manager.flush();
        manager.getTransaction().commit(); 
    }

    @Override
    public void update(T model) {
        manager.getTransaction().begin();
        manager.merge(model);
        manager.flush();
        manager.getTransaction().commit();
    }

    @Override
    public void remove(T model) {
        manager.getTransaction().begin();
        manager.remove(model);
        manager.flush();
        manager.getTransaction().commit();
    }

    @Override
    public T find(Integer id) {
        return manager.find(model, id);
    }
    
}
