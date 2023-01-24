package Aufgabe_2;

public class Nordsüdfabrik extends Schuhfabrik {
    @Override
    public Schuh erzeugeProdukte(Schuhart art) {
        Schuh temp = null;
        switch(art){
            case STIEFEL -> temp = new Stiefel(this);
            case SANDALEN -> temp = new Sandalen(this);
            case SPORTSCHUH -> temp = new Sportschuh(this);
        }
        return temp;
    }
}
