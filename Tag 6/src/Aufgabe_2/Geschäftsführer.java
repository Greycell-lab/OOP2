package Aufgabe_2;

public class Geschäftsführer implements Grüßbar{
    private String name;
    public Geschäftsführer(Einkaufszentrum einkaufszentrum, String name){
        this.name = name;
        einkaufszentrum.grüßbarHinzufügen(this);
    }
    @Override
    public void grüßen() {
        System.out.println("Geschäftsführer " + name + " grüßt: Irasshaimase!!!");
    }
}
