package Aufgabe_4;

public class Bäckerei implements Observer{
    @Override
    public void update(Kunde kunde) {
        System.out.println("Der Geburtstagskuchen für " + kunde.getName() + " mit der Geschmacksrichtung " + kunde.getLieblingsgeschmacksrichtung() + " wurde gebacken!");
    }
}
