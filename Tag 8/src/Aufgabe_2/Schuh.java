package Aufgabe_2;

public abstract class Schuh {
    Schuhfabrik fabrik;
    public Schuh(Schuhfabrik fabrik){
        this.fabrik = fabrik;
        this.gebeSchuhAus();
    }
    public abstract void gebeSchuhAus();
}
