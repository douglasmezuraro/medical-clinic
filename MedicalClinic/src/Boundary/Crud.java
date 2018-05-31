package Boundary;

import Classes.CrudAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.Base;

public abstract class Crud<T extends Base> {
    
    // TODO : após finalizar trabalho tornar essa property 'protected'
    public List<T> list; 
    protected Scanner input; 
    
    public Crud() {
        list = new ArrayList<>();
        input = new Scanner(System.in);
    }
    
    protected int askForId(CrudAction action) {
        System.out.println("Digite o id que deseja " + action.name() + ": ");
        return Integer.parseInt(input.nextLine());
    }
    
    protected abstract void create();
    
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
    
    protected abstract void createOrUpdate(T object);
    
}
