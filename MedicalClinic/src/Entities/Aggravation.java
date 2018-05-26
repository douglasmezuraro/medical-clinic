package Entities;

import java.util.List;

public class Aggravation {

    private boolean smoker;
    private boolean drinker;
    private boolean heartDicease;
    private List<Surgery> surgeries;
    private List<Allergy> allergies;    

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

    public List<Surgery> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<Surgery> surgeries) {
        this.surgeries = surgeries;
    }

    public List<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }

}
