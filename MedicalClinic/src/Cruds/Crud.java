package Cruds;

import Utils.CrudAction;
import java.util.ArrayList;
import java.util.List;
import Entities.Base;
import Utils.CustomScanner;

public abstract class Crud<T extends Base> {
    
    protected List<T> list; 
    protected CustomScanner input; 
    protected String description;
    
    public Crud() {
        list = new ArrayList<>();
        input = new CustomScanner();
    }
    
    public List<T> getList() {
        return list;
    }
    
    protected int askForId(CrudAction action) {
        return input.readInt(String.format(
            "Digite o id do(a) %s que deseja %s:", 
            description, 
            action.getDescription()));          
    }
    
    private int generateId() {
        int higherId = 0;
        
        for(T object: list) {
            if(object.getId() > higherId) {
                higherId = object.getId();
            }
        }

        higherId += 1;
        
        return higherId;
    }
    
    public abstract int create();
    
    private T retrieve(CrudAction action) {
        int id = askForId(action);
       
        for(T element: list) {
            if(element.getId() == id) {
                return element;
            }
        }
    
        return null;
    }
    
    public T retrieve() {
        return retrieve(CrudAction.Retrieve);
    }
    
    public void update() {
        T object = retrieve(CrudAction.Update);
        createOrUpdate(object);
    }
    
    public void delete() {
        T object = retrieve(CrudAction.Delete);
        
        if(list.contains(object))
            list.remove(object);
    }
    
    protected abstract int createOrUpdate(T object);
    
    protected int add(T object) {
        if (!list.contains(object)) {
            object.setId(generateId());
            list.add(object);
            return object.getId();
        }
        else return 0;
    }
    
}
