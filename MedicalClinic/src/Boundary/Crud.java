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
    
    public Crud() {
        list = new ArrayList<>();
        input = new CustomScanner();
    }
    
    protected int askForId(CrudAction action) {
        return input.readInt("Digite o id que deseja " + action.getDescription() + ": ");
    }
    
    protected abstract void create();
    
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
    
    protected abstract void createOrUpdate(T object);
    
    protected void add(T object) {
        if (!list.contains(object)) {
            list.add(object);
        }
        //else
        // TODO : lançar excessão de objeto duplicado
        // throw new DuplicateObjectException();   
    }
    
}
