package Model;

import Utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AGREEMENTS")
public class Agreement extends Base {

    @Column(length = Constants.DESCRIPTION)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }        
    
    public static List<String> seed() {
        return new ArrayList<>(Arrays.asList(
                "Particular",
                "Plano de saúde"));
    }
    
}
