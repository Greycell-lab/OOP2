package Aufgabe_3;

import java.util.ArrayList;
import java.util.List;

public class Speise extends Waren {
    private List<String> zutaten = new ArrayList<>();
    public Speise(String bezeichnung, double preis, List<String> zutaten){
        super(bezeichnung, preis);
        this.zutaten = zutaten;
    }
    @Override
    public String toString(){
        return super.toString() + "\nZutaten: " + this.zutaten.toString();
     }

}
