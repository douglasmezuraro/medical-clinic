package Boundary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Base;

public abstract class Cadastrable<T extends Base> {
    
    // TODO : após finalizar trabalho tornar essa property 'protected'
    public List<T> list; 
    protected Scanner input; 
    
    public Cadastrable() {
        list = new ArrayList<>();
        input = new Scanner(System.in);
    }

    protected T retrieve(int id) {
        for(T element: list) {
            if(element.getId() == id) {
                return element;
            }
        }
        return null;
    }
    
    protected void delete(T object) {
        if(list.contains(object))
            list.remove(object);
    }
    
}
