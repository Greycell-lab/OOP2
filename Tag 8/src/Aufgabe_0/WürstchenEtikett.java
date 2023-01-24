package Aufgabe_0;

import java.time.LocalDate;

public abstract class WürstchenEtikett {
    LocalDate mindesthaltbarkeit;
    String[][] zutaten;
    String name;
    public WürstchenEtikett(String name, String[][] zutaten, LocalDate mindesthaltbarkeit){
        this.name = name;
        this.zutaten = zutaten;
        this.mindesthaltbarkeit = mindesthaltbarkeit;
    }
    public void berechneMindesthaltbarkeit(LocalDate mindesthaltbarkeit){
        this.mindesthaltbarkeit = mindesthaltbarkeit;
    }
    public void druckeEtikett(){
        System.out.println("Drucke Etikett...");
    }
    public abstract double getPreis();

}
