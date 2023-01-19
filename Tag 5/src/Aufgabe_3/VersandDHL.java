package Aufgabe_3;

public class VersandDHL implements Berechenbar {
    @Override
    public double berechneVersand(Versand versand) {
        versand.setVersandArt("DHL");
        if(!versand.getZielort().getLand().equals("GER")) return 6.5;
        return 3.5;

    }
}
