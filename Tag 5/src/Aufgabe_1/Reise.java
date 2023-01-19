package Aufgabe_1;

public class Reise {
    private double grundpreis;
    private double gesamtpreis;
    private int tageBisReisebeginn;
    private boolean goldReise;
    Storno storno;
    public Reise(double grundpreis, int tageBisReisebeginn, boolean goldReise){
        this.grundpreis = grundpreis;
        this.tageBisReisebeginn = tageBisReisebeginn;
        if(goldReise) {
            gesamtpreis += grundpreis * 1.75;
            storno = new KulanterStorno();
        }
        else {
            gesamtpreis += grundpreis * 1.25;
            storno = new StrengerStorno();
        }
    }

    public double getGesamtpreis() {
        return gesamtpreis;
    }

    public int getTageBisReisebeginn() {
        return tageBisReisebeginn;
    }
}
