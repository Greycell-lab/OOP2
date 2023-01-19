package Aufgabe_3;

public class VersandUPS implements Berechenbar {
    @Override
    public double berechneVersand(Bestellung bestellung) {
        bestellung.setVersandArt("UPS");
        if(!bestellung.getZielort().getLand().equals("GER")) return 7.9;
        return 4.9;
    }
}
