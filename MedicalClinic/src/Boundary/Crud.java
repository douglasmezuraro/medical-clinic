package Boundary;

import Classes.CrudAction;
import java.util.ArrayList;
import java.util.List;
import Classes.Base;
import Classes.CustomScanner;

public abstract class Crud<T extends Base> {
    
    // TODO : após finalizar trabalho tornar essa property 'protected'
    public List<T> list; 
    protected CustomScanner input; 
    protected String description;
    
    public Crud() {
        list = new ArrayList<>();
        input = new CustomScanner();
    }
    
    protected int askForId(CrudAction action) {
        return input.readInt(
            "Digite o id do(a) " + description + " que deseja " + action.getDescription() + ": ");
    }
    
    private int generateId() {
        int id = 1;
        if(!list.isEmpty()) {
            for(T object: list) {
                if(object.getId() > 0)
                    id = object.getId();
            }
            id += 1;
        }
        
        return id;
    }
    
    protected abstract int create();
    
    private T retrieve(CrudAction action) {
        int id = askForId(action);
       
        for(T element: list) {
            if(element.getId() == id) {
                return element;
            }
        }
        // TODO : lançar excessão de objeto não encontrado
        // throw new ObjectNotFoundException();        
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
        else
            return 0;
        // TODO : lançar excessão de objeto duplicado
        // throw new DuplicateObjectException();   
    }
    
}
