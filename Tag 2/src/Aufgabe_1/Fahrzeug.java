package Aufgabe_1;

import java.util.ArrayList;

public abstract class Fahrzeug {
    public static ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
    protected Fahrzeug(){
        fahrzeuge.add(this);
    }

}
