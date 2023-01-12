package Aufgabe_3;

import java.util.ArrayList;

public abstract class Waren {
    private String bezeichnung;
    private double preis;
    private static ArrayList<Waren> liste = new ArrayList<>();
    protected Waren(String bezeichnung, double preis){
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        liste.add(this);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public static ArrayList<Waren> getListe() {
        return liste;
    }
    @Override
    public String toString(){
        return "Bezeichnung: " + this.getBezeichnung() + "\nPreis: " + this.getPreis();
    }
}
