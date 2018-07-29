package Model;

import Utils.Constants;
import Utils.Utils;
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
       return Utils.isNullOrEmpty(value) ? Constants.DEFAULT_ID : Long.parseLong(value);
    } 
    
}
