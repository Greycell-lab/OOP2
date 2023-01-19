package Aufgabe_3;

public class VersandAPL implements Berechenbar{
    @Override
    public double berechneVersand(Versand versand) {
        versand.setVersandArt("APL");
        if(!versand.getZielort().getLand().equals("GER")) return 4.5;
        return 1.5;
    }
}
