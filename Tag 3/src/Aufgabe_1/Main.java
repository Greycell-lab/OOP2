package Aufgabe_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Kunde("Peter");
        new Kunde("Lisa"){
            @Override
            public String getInfo(){
                return ">";
            }
        };
        new Kunde("Anna");
        drucken(Kunde.kunden);
    }
    public static void drucken(ArrayList<IDruckbar> druckbar){
        for(var x : druckbar) System.out.println(x.getInfo());
    }
}
