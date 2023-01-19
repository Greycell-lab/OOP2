package Aufgabe_1;

public class Main {
    public static void main(String[] args) {
        Reise reise1 = new Reise(1500.99, 11, false);
        System.out.println(reise1.storno.stornoBerechnung(reise1.getGesamtpreis(), reise1.getTageBisReisebeginn()));
        Reise reise2 = new Reise(1500.99, 1, true);
        System.out.println(reise2.storno.stornoBerechnung(reise2.getGesamtpreis(), reise2.getTageBisReisebeginn()));
    }
}
