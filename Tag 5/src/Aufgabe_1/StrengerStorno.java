package Aufgabe_1;

public class StrengerStorno implements Storno {
    @Override
    public double stornoBerechnung(double preisReise, int tageBisReisebeginn) {
        return tageBisReisebeginn > 10 ? preisReise * 0.25 : preisReise * 0.75;
    }
}
