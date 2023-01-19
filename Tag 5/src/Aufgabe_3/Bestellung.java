package Aufgabe_3;

public class Bestellung {
    private Adresse zielort;
    private Adresse herkunft;
    private String versandArt;
    private BerechnungsService versandBerechnung;
    private double versandKosten;

    Bestellung(Adresse zielort, Adresse herkunft, BerechnungsService versandBerechnung){
        this.zielort = zielort;
        this.herkunft = herkunft;
        this.versandBerechnung = versandBerechnung;
        versandKosten = versandBerechnung.berechneVersand(this);
    }
    public Adresse getZielort() {
        return zielort;
    }
    public Adresse getHerkunft() {
        return herkunft;
    }
    public BerechnungsService getBerechnung() {return versandBerechnung;}
    public void setBerechnung(BerechnungsService versandBerechnung) {
        this.versandBerechnung = versandBerechnung;
        versandBerechnung.berechneVersand(this);
    }
    public void setVersandArt(String versandArt){
        this.versandArt = versandArt;
    }
    public String getVersandArt(){
        return versandArt;
    }
    public String toString(){
        return zielort + "\n" + herkunft + "\n" + "Versandart: " + versandArt + "\n" + "Versandkosten: " + versandKosten;
    }
}
