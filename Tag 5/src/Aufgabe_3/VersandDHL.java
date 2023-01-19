package Aufgabe_3;

public class VersandDHL implements BerechnungsService {
    @Override
    public double berechneVersand(Bestellung bestellung) {
        bestellung.setVersandArt("DHL");
        return 3.5;
    }
}
