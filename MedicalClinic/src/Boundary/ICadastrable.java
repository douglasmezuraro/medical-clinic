package Boundary;

import Entities.Base;

public interface ICadastrable<T extends Base> {
    
    public void create();
    public void retrieve();
    public void update();
    public void delete();
    
}
