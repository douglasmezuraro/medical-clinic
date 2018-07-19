package DAO;

import java.util.List;

public interface IDAO<T> {
    
    public void add(T model);
    public void update(T model);
    public void remove(Integer id);
    public T find(Integer id);
    public List<T> findAll();
            
}
