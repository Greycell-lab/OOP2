package Aufgabe_2;

public class Sportschuh extends Schuh {
    public Sportschuh(Schuhfabrik fabrik){
        super(fabrik);
    }
    @Override
    public void gebeSchuhAus() {
        System.out.println("Sportschuhe wurden erstellt in der " + fabrik.getClass().getSimpleName());
    }
}
