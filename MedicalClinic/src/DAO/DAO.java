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
        
    protected void executeWithTransaction(Runnable method) {
        manager.getTransaction().begin();
        method.run();
        manager.flush();
        manager.getTransaction().commit();        
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
        executeWithTransaction(() -> {
            manager.persist(model);
        });
    }

    @Override
    public void update(T model) {
        executeWithTransaction(() -> {
            manager.merge(model);
        });
    }

    @Override
    public void remove(T model) {
        executeWithTransaction(() -> {
            manager.remove(model);
        });
    }

    @Override
    public T find(Integer id) {
        return manager.find(model, id);
    }
    
}
