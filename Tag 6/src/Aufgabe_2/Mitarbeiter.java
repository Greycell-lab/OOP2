package Aufgabe_2;

public class Mitarbeiter implements Grüßbar {
    private String name;
    public Mitarbeiter(Einkaufszentrum einkaufszentrum, String name){
        this.name = name;
        einkaufszentrum.grüßbarHinzufügen(this);
    }
    @Override
    public void grüßen() {
        System.out.println("Mitarbeiter " + name + " grüßt: Irasshaimase!");
    }
}
