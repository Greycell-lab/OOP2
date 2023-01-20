package Aufgabe_0;

import java.util.ArrayList;

public class Person {
    public ArrayList<Feuerlöscher> feuerLöscher = new ArrayList<>();
    public void feuerRufen(){
        System.out.println("FEUER!");
        feuerLöscher.forEach(f -> f.feuerLöschen());
    }
    public void feuerlöscherHinzufügen(Feuerlöscher feuerlöscher){
        feuerLöscher.add(feuerlöscher);
    }
}
