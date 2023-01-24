package Aufgabe_0;

public class ExpressVersand implements Versand {
    @Override
    public double berechnen(double gesamtWert) {
        return gesamtWert >= 100 ? 10.0 : 15.0;
    }
}
