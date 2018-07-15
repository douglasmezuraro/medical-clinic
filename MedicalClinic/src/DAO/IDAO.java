package DAO;

import Model.Base;
import java.util.List;

public interface IDAO<T extends Base> {
    
    public void connect();
    public void disconnect();
    public void add(T model);
    public void update(T model);
    public void remove(T model);
    public T find(Integer id);
    public List<T> findAll();
            
}
