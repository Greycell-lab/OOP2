package Aufgabe_0;

import java.util.HashMap;

public class Warenkorb {
    private HashMap<Artikel, Integer> warenkorb = new HashMap<>();
    private Versand versandArt;
    private double gesamtWert;

    public void setVersandArt(Versand versandArt) {
        this.versandArt = versandArt;
    }
    public void getGesamtWert(){
        for(Artikel x : warenkorb.keySet()){
            gesamtWert += x.getPreis() * warenkorb.get(x);
        }
        System.out.println("Gesamtbetrag ohne Versand: " + gesamtWert + "€");
        gesamtWert += versandArt.berechnen(this.gesamtWert);
        System.out.println("Gesamtbetrag incl. Versand: " + gesamtWert + "€");
    }
    public HashMap<Artikel, Integer> getWarenkorb(){
        return warenkorb;
    }
}
