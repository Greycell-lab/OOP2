package Aufgabe_2;

public class Hund extends GeräuscheMacher {
    public Hund(){
        super();
    }
    @Override
    public void macheGeräusch() {
        System.out.println("Wau Wau Kläff Grrrrr ...");
    }
}
