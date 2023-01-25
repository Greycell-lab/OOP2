package Aufgabe_1;

import Aufgabe_1.Bibliothek.QuadratischerStöpsel;

public class QuadratischZuRundAdapter {
    QuadratischerStöpsel quadratischerStöpsel;

    public QuadratischZuRundAdapter(QuadratischerStöpsel stöpsel) {
        this.quadratischerStöpsel = stöpsel;
    }
    public double convert(){
        return (int)((quadratischerStöpsel.getSeitenlänge()*Math.sqrt(2)/2)*100)/100.0;
    }
    public String prüfeStöpsel(RundesLoch loch){
        return convert() <= loch.getRadius() ? "passt" : "passt nicht";
    }
}
