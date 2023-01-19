package Aufgabe_3;

public class VersandHERMES implements Berechenbar {
    @Override
    public double berechneVersand(Bestellung bestellung) {
        bestellung.setVersandArt("HERMES");
        if(!bestellung.getZielort().getLand().equals("GER")) return 5.9;
        return 2.9;
    }
}
