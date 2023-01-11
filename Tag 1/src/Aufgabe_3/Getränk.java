package Aufgabe_3;

public class Getränk extends Imbiss {
    private int milliliter;
    public Getränk(String bezeichnung, double preis, int milliliter){
        super(bezeichnung, preis);
        this.milliliter = milliliter;
    }
    @Override
    public String toString(){
        return "Bezeichnung: " + this.getBezeichnung() + "\nPreis: " + this.getPreis() + "\nFüllmenge: " + this.milliliter + "ml";
    }
}
