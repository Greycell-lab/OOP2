package Aufgabe_4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Kunde{
    public static ArrayList<Kunde> kunden = new ArrayList<>();
    public ArrayList<Observer> observer = new ArrayList<>();
    private final String name;
    private final LocalDate geburtstag;
    private final String lieblingsgeschmacksrichtung;
    public Kunde(String name, LocalDate geburtstag, String lieblingsgeschmacksrichtung){
        this.name = name;
        this.geburtstag = geburtstag;
        this.lieblingsgeschmacksrichtung = lieblingsgeschmacksrichtung;
        kunden.add(this);
    }
    public void addObserver(Observer ob){
        observer.add(ob);
    }
    public void notifyObserver(){
        observer.forEach(o -> o.update(this));
    }

    public String getName() {
        return name;
    }

    public String getLieblingsgeschmacksrichtung() {
        return lieblingsgeschmacksrichtung;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }
}
