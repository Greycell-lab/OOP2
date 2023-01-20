package Aufgabe_3;

import java.util.ArrayList;
import java.util.HashMap;

public class Fahrzeug {
    private String kennzeichen;
    private boolean bearbeitet;
    private ArrayList<Observer> observers = new ArrayList<>();
    public Fahrzeug(String kennzeichen){
        this.kennzeichen = kennzeichen;
        this.bearbeitet = false;
    }
    public void observerHinzufügen(Werkstatt werkstatt){
        observers.add(werkstatt);
    }
    public void setBearbeitet(boolean bearbeitet) {
        this.bearbeitet = bearbeitet;
    }

    public boolean getBearbeitet() {
        return bearbeitet;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    @Override
    public String toString(){
        return "Kennzeichen: " + kennzeichen + "\nBearbeitet: " + (bearbeitet ? "Ja" : "Nein");
    }
}
