package Aufgabe_1;

public class Bagger extends Fahrzeug implements IFahrbar, ISchwimmfähig {
    public void fahren(){
        System.out.println("Ich fahre");
    }
    public void schwimmen(){
        System.out.println("Ich schwimme");
    }
}
