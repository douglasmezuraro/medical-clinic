package DAO;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import Classes.EntityManagerSingleton;

public abstract class DAO<T> implements IDAO<T> {
    
    private Class<T> model;
    
    protected DAO(Class<T> model) {        
        this.model = model;
    }
        
    protected void executeWithTransaction(Runnable method) {
        EntityManagerSingleton.getInstance().getEntityManager().getTransaction().begin();
        method.run();
        EntityManagerSingleton.getInstance().getEntityManager().flush();
        EntityManagerSingleton.getInstance().getEntityManager().getTransaction().commit(); 
    }
   
    @Override
    public void add(T model) {
        executeWithTransaction(() -> {
            EntityManagerSingleton.getInstance()
                                  .getEntityManager()
                                  .persist(model);
        });
    }

    @Override
    public void update(T model) {
        executeWithTransaction(() -> {
            EntityManagerSingleton.getInstance()
                                  .getEntityManager()
                                  .merge(model);
        });
    }

    @Override
    public void remove(Integer id) {
        executeWithTransaction(() -> {
            EntityManagerSingleton.getInstance()
                                  .getEntityManager()
                                  .remove(find(id));
        });
    }

    @Override
    public T find(Integer id) {
        return EntityManagerSingleton.getInstance()
                                     .getEntityManager()
                                     .find(model, id);
    }
    
    @Override
    public List<T> findAll() {
        CriteriaBuilder builder = EntityManagerSingleton.getInstance()
                                                        .getEntityManager()
                                                        .getCriteriaBuilder();
        
        CriteriaQuery<T> query = builder.createQuery(model);
        query.from(model);
        
        return EntityManagerSingleton.getInstance()
                                     .getEntityManager()
                                     .createQuery(query)
                                     .getResultList();
    }
    
}
