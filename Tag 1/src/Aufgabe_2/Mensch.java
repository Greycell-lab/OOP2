package Aufgabe_2;

public class Mensch extends GeräuscheMacher {
    public Mensch(){
        super();
    }
    @Override
    public void macheGeräusch() {
        System.out.println("Java lernen ist toll!");
    }
}
