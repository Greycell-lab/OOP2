package Aufgabe_3;

public class VersandDHL implements Berechenbar {
    @Override
    public double berechneVersand(Bestellung bestellung) {
        bestellung.setVersandArt("DHL");
        if(!bestellung.getZielort().getLand().equals("GER")) return 6.5;
        return 3.5;

    }
}
