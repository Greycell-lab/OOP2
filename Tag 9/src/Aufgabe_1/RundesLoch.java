package Aufgabe_1;

import Aufgabe_1.Bibliothek.QuadratischerStöpsel;

public class RundesLoch {
    private double radius;

    public RundesLoch(double radius) {
        this.radius = radius;
    }
    public String prüfeStöpsel(Stöpsel stöpsel){
        double temp = 0;
        if(stöpsel instanceof QuadratischerStöpsel) temp = new QuadratischZuRundAdapter((QuadratischerStöpsel)stöpsel).convert();
        return temp <= this.radius ? "passt" : "passt nicht";
    }

    public double getRadius() {
        return radius;
    }
}
