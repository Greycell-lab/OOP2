package Aufgabe_3;

public class Bestellung {
    private final Adresse zielort;
    private final Adresse herkunft;
    private String versandArt;
    private Berechenbar versandBerechnung;
    private double versandKosten;

    Bestellung(Adresse zielort, Adresse herkunft, Berechenbar versandBerechnung){
        this.zielort = zielort;
        this.herkunft = herkunft;
        this.versandBerechnung = versandBerechnung;
        versandKosten = versandBerechnung.berechneVersand(this);
    }
    public void setBerechnung(Berechenbar versandBerechnung) {
        this.versandBerechnung = versandBerechnung;
        versandKosten = versandBerechnung.berechneVersand(this);
    }
    public void setVersandArt(String versandArt){
        this.versandArt = versandArt;
    }
    public String toString(){
        return zielort + "\n" + herkunft + "\n" + "Versandart: " + versandArt + "\n" + "Versandkosten: " + versandKosten;
    }

    public Adresse getZielort() {
        return zielort;
    }
}
