package Aufgabe_1;

import Aufgabe_1.Bibliothek.QuadratischerStöpsel;

public class RundesLoch {
    private double radius;

    public RundesLoch(double radius) {
        this.radius = radius;
    }
    public String prüfeStöpsel(Stöpsel stöpsel){
        if(stöpsel instanceof QuadratischerStöpsel) new QuadratischZuRundAdapter((QuadratischerStöpsel)stöpsel).convert();
        return stöpsel.radius <= this.radius ? "passt" : "passt nicht";
    }

    public double getRadius() {
        return radius;
    }
}
