package Aufgabe_3;

public class VersandHERMES implements BerechnungsService {
    @Override
    public double berechneVersand(Bestellung bestellung) {
        bestellung.setVersandArt("HERMES");
        return 2.90;
    }
}
