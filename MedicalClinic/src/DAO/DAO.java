package DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import Model.Base;
import java.util.List;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class DAO<T extends Base> implements IDAO<T> {

    @PersistenceContext
    private EntityManager manager;
    
    private final Class<T> model;
    
    protected DAO(Class<T> model) {        
        this.model = model;
    }
        
    protected void executeWithTransaction(Runnable method) {
        connect();
        manager.getTransaction().begin();
        method.run();
        manager.flush();
        manager.getTransaction().commit();        
        disconnect();
    }
    
    @Override
    public void connect() {
        manager = Persistence.createEntityManagerFactory("MedicalClinicPU").createEntityManager();
    }

    @Override
    public void disconnect() {
        manager.close();
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
    
    @Override
    public List<T> findAll() {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(model);
        query.from(model);
        return manager.createQuery(query).getResultList();
    }
    
}
