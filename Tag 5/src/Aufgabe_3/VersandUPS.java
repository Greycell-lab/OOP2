package Aufgabe_3;

public class VersandUPS implements Berechenbar {
    @Override
    public double berechneVersand(Versand versand) {
        versand.setVersandArt("UPS");
        if(!versand.getZielort().getLand().equals("GER")) return 7.9;
        return 4.9;
    }
}
