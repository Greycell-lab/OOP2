package Aufgabe_5;

import java.util.ArrayList;

public class Kunde {
    public static ArrayList<Kunde> kunden = new ArrayList<>();
    private int nummer;
    private String name;
    public Kunde(String name, int nummer){
        this.name = name;
        this.nummer = nummer;
        kunden.add(this);
    }
}
