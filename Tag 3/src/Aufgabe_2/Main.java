package Aufgabe_2;

public class Main {
    public static void main(String[] args) {
        new Mitarbeiter("Rolz", 2);
        new Mitarbeiter("Polz", 1);
        new Mitarbeiter("Holz", 6);
        Mitarbeiter neu = null;
        try {
            for (var x : Mitarbeiter.mitarbeiter) neu = (Mitarbeiter) Mitarbeiter.stringConverter.fromString("6");
            System.out.println(neu.getName());
        }catch(NullPointerException e){
            System.out.println("Mitarbeiter-Nummer nicht gefunden.");
        }


    }
}
