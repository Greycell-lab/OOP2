package Aufgabe_3;

import java.util.ArrayList;

public class Speise extends Imbiss {
    private ArrayList<String> zutaten = new ArrayList<>();
    public Speise(String bezeichnung, double preis, ArrayList<String> zutaten){
        super(bezeichnung, preis);
        this.zutaten = zutaten;
    }
    @Override
    public String toString(){
        return "Bezeichnung: " + this.getBezeichnung() + "\nPreis: " + this.getPreis() + "\nZutaten: " + this.zutaten.toString();
     }

}
