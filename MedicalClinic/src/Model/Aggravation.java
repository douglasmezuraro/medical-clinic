package Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Allergy> allergies;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Surgery> surgeries;

    public List<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }

    public List<Surgery> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<Surgery> surgeries) {
        this.surgeries = surgeries;
    }
    
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

}
