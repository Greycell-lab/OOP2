package Aufgabe_1;

public class Main {
    public static void main(String[] args) {
        new Auto();
        new Flugzeug();
        new Bagger();
        new Boot();
        for(var x : Fahrzeug.fahrzeuge) {
            if(x instanceof IFlugfähig f) f.fliegen();
            if(x instanceof IFahrbar f) f.fahren();
            if(x instanceof  ISchwimmfähig s) s.schwimmen();
        }
        if(ISchwimmfähig.isArray)
    }
}
