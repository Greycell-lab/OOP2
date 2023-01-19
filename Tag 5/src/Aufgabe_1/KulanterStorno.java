package Aufgabe_1;

public class KulanterStorno implements Storno {
    @Override
    public double stornoBerechnung(double preisReise, int tageBisReisebeginn) {
        if(tageBisReisebeginn > 1) return preisReise * 0.25;
        else return preisReise * 0.50;
    }
}
