package Aufgabe_0;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Artikel {
    public static ArrayList<Artikel> artikelListe = new ArrayList<>();
    private double preis;
    private String bezeichnung;
    public Artikel(double preis, String bezeichnung){
        this.preis = preis;
        this.bezeichnung = bezeichnung;
        artikelListe.add(this);
    }

    public double getPreis() {
        return preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
