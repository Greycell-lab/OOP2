package Aufgabe_2;

public class Main {
    public static void main(String[] args) {
        new Mitarbeiter("Rolf", 2);
        new Mitarbeiter("Peter", 1);
        new Mitarbeiter("Klaus", 6);
        Mitarbeiter neu;
        try {
            neu = (Mitarbeiter)Mitarbeiter.stringConverter.fromString("3");
            System.out.println(neu.getName());
        }catch(NullPointerException e){
            System.out.println("Mitarbeiter-Nummer nicht gefunden.");
        }
    }
}
