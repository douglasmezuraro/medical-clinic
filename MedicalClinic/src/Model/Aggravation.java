package Model;

import Utils.Constants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "AGGRAVATIONS")
public class Aggravation extends Base {

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(nullable = false)
    private boolean smoker;
    
    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(nullable = false)
    private boolean drinker;
    
    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(nullable = false)
    private boolean heartDicease;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String allergies;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    private String surgeries;
    
    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean isDrinker() {
        return drinker;
    }

    public void setDrinker(boolean drinker) {
        this.drinker = drinker;
    }

    public boolean hasHeartDicease() {
        return heartDicease;
    }

    public void setHeartDicease(boolean heartDicease) {
        this.heartDicease = heartDicease;
    }
    
    public String getAllergies() {
        return allergies;
    }

    public String getSurgeries() {
        return surgeries;
    }

}
