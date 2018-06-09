package Entities;

public class Aggravation extends Base {

    private boolean smoker;
    private boolean drinker;
    private boolean heartDicease;
    private String surgeries;
    private String allergies;    

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

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

}
