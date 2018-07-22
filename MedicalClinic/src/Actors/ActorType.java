package Actors;

import java.util.Arrays;

public enum ActorType {
    
    Doctor("Médico"),
    Secretary("Secretário");
    
    private final String name;

    public String getDescription() {
        return name;
    }
    
    ActorType(String name) {
        this.name = name;
    }
    
    public static String[] foo() {
        return Arrays.stream(values()).map(Enum::name).toArray(String[]::new);   
    }
    
} 
