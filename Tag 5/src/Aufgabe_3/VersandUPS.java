package Aufgabe_3;

public class VersandUPS implements BerechnungsService {
    @Override
    public double berechneVersand(Bestellung bestellung) {
        bestellung.setVersandArt("UPS");
        return 4.90;
    }
}
