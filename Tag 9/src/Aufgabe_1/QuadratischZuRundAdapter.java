package Aufgabe_1;

import Aufgabe_1.Bibliothek.QuadratischerStöpsel;

public class QuadratischZuRundAdapter implements AdapterRundesLoch{
    QuadratischerStöpsel stöpsel;

    public QuadratischZuRundAdapter(QuadratischerStöpsel stöpsel) {
        this.stöpsel = stöpsel;
    }


    @Override
    public void convert() {
        stöpsel.setRadius((int)((stöpsel.getSeitenlänge()*Math.sqrt(2)/2)*100)/100.0);
    }
}
