package Aufgabe_2;

public class Main {
    public static void main(String[] args) {
        Einkaufszentrum einkaufszentrum = new Einkaufszentrum();
        new Mitarbeiter(einkaufszentrum, "Sven");
        new Mitarbeiter(einkaufszentrum, "Eduart");
        new Geschäftsführer(einkaufszentrum, "Dominik");
        einkaufszentrum.neuerKundeBetrittDasGebäude();
    }
}
