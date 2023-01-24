package Aufgabe_2;

public class Stiefel extends Schuh {
    public Stiefel(Schuhfabrik fabrik){
        super(fabrik);
    }
    @Override
    public void gebeSchuhAus() {
        System.out.println("Stiefel wurden erstellt in der " + getFabrik().getClass().getSimpleName());
    }
}
