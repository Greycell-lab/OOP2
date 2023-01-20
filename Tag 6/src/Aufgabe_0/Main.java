package Aufgabe_0;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.feuerlöscherHinzufügen(new Feuerwehr());
        person.feuerlöscherHinzufügen(new Feuerwehr());
        person.feuerlöscherHinzufügen(new Feuerwehr());
        person.feuerlöscherHinzufügen(new Feuerwehr());
        person.feuerRufen();
    }
}