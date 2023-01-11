package Aufgabe_3;

import java.util.ArrayList;

public abstract class Imbiss {
    private String bezeichnung;
    private double preis;
    static ArrayList<Imbiss> liste = new ArrayList<>();
    protected Imbiss(String bezeichnung, double preis){
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

    public static ArrayList<Imbiss> getListe() {
        return liste;
    }
}
