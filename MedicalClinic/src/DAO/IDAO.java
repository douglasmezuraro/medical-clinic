package DAO;

import model.Base;

public interface IDAO<T extends Base> {
    
    public void connect();
    public void disconnect();
    public void add(T model);
    public void update(T model);
    public void remove(T model);
    public T find(Integer id);
            
}
