package Aufgabe_2;

public class Sandalen extends Schuh {
    public Sandalen(Schuhfabrik fabrik){
        super(fabrik);
    }
    @Override
    public void gebeSchuhAus() {
        System.out.println("Sandalen wurden erstellt in der " + fabrik.getClass().getSimpleName());
    }
}
