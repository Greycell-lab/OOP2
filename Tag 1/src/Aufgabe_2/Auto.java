package Aufgabe_2;

public class Auto extends GeräuscheMacher {
    public Auto(){
        super();
    }
    @Override
    public void macheGeräusch() {
        System.out.println("Brummmmm ...");
    }
}
