package Aufgabe_1.Bibliothek;

import Aufgabe_1.Stöpsel;

public class QuadratischerStöpsel extends Stöpsel {
    private double seitenlänge;

    public QuadratischerStöpsel(double seitenlänge) {
        this.seitenlänge = seitenlänge;
    }

    public double getSeitenlänge() {
        return seitenlänge;
    }
}
