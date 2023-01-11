package Aufgabe_2;

public class Main {

    public static void main(String[] args) {
        new Auto();
        new Hund();
        new Mensch();
        for(var x : GeräuscheMacher.macher) {
            if(x instanceof Auto a) a.macheGeräusch();
            if(x instanceof Hund h) h.macheGeräusch();
            if(x instanceof Mensch m) m.macheGeräusch();
        }
    }
}
