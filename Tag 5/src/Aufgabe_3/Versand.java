package Aufgabe_3;

public class Versand {
    private final Adresse zielort;
    private final Adresse herkunft;
    private String versandArt;
    private Berechenbar versandBerechnung;
    private double versandKosten;

    Versand(Adresse zielort, Adresse herkunft, Berechenbar versandBerechnung){
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
        return "Empfänger\t\t\t\tAbsender\n"+ zielort.getName() + "\t\t\t" + herkunft.getName() + "\n" + zielort.getStrasse() + "\t\t\t" + herkunft.getStrasse() + "\n" + zielort.getPostleitzahl() + " " + zielort.getStadt() + "\t\t\t" + herkunft.getPostleitzahl() + " " + herkunft.getStadt() + "\n" + zielort.getLand() + "\t\t\t\t\t\t" + herkunft.getLand() + "\nVersandart: " + versandArt + "\nKosten: " + String.format("%.2f",versandKosten) + "€";
    }

    public Adresse getZielort() {
        return zielort;
    }
}
