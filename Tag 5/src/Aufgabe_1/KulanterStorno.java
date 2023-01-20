package Aufgabe_1;

public class KulanterStorno implements Storno {
    @Override
    public double stornoBerechnung(double preisReise, int tageBisReisebeginn) {
        return tageBisReisebeginn > 1 ? preisReise * 0.25 : preisReise * 0.50;
    }
}
