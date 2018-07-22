package Model;

import Utils.Constants;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Base implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    public Long getId() {
        return id;
    }
    
    public static Long parseId(String value) {
        if(value == null || value.equalsIgnoreCase(Constants.EMPTY_STRING))
           return Constants.DEFAULT_ID;
       
       return Long.parseLong(value);
    } 
    
}
