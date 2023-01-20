package Aufgabe_3;

public class Main {
    public static void main(String[] args) {
        Werkstatt werkstatt = new Werkstatt();
        Fahrzeug fahrzeug = new Fahrzeug("WÜ-DS 434");
        Kunde kunde = new Kunde("Sven Svenson", 233214142, "0844324544");
        fahrzeug.observerHinzufügen(werkstatt);
        werkstatt.setAufträge(fahrzeug, kunde);
        werkstatt.setBearbeitung(fahrzeug);
    }
}
