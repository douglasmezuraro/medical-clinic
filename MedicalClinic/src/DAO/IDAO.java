package DAO;

import java.util.List;

public interface IDAO<T> {
    
    public void add(T model);
    public void update(T model);
    public void remove(T model);
    public T find(Long id);
    public List<T> findAll();
    public abstract void seed();
            
}
