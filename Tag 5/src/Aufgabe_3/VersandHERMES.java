package Aufgabe_3;

public class VersandHERMES implements Berechenbar {
    @Override
    public double berechneVersand(Versand versand) {
        versand.setVersandArt("HERMES");
        if(!versand.getZielort().getLand().equals("GER")) return 5.9;
        return 2.9;
    }
}
