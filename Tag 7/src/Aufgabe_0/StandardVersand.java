package Aufgabe_0;

public class StandardVersand implements Versand {
    @Override
    public double berechnen(double gesamtWert) {
        return gesamtWert >= 100 ? 5.0 : 10.0;
    }
}
