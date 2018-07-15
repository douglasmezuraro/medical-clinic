package Model;

import Classes.Constants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ALLERGIES")
public class Allergy extends Base {
    
    @Column(length = Constants.DESCRIPTION)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }       
    
}
