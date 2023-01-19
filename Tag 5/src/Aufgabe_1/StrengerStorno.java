package Aufgabe_1;

public class StrengerStorno implements Storno {
    @Override
    public double stornoBerechnung(double preisReise, int tageBisReisebeginn) {
        if(tageBisReisebeginn > 10) return preisReise * 0.25;
        else return preisReise * 0.75;
    }
}
