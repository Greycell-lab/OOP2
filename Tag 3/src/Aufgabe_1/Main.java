package Aufgabe_1;

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
        for(var x : Kunde.kunden) drucken(x);
    }
    public static void drucken(IDruckbar druckbar){
        System.out.println(druckbar.getInfo());
    }
}
