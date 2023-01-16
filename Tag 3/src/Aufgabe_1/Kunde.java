package Aufgabe_1;

import java.util.ArrayList;

public class Kunde implements IDruckbar{
    private String name;
    public static ArrayList<Kunde> kunden = new ArrayList<>();
    public Kunde(String name){
        this.name = name;
        kunden.add(this);
    }
    public String getInfo(){
        return this.name;
    }
}
