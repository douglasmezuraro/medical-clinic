package CRUD;

import java.util.ArrayList;
import java.util.List;

public abstract class CRUD<T> {
    
    private List<T> list;
    
    public CRUD() {
        list = new ArrayList<T>();
    }
    
    public List<T> getList() {
        return list;
    }
    
}
