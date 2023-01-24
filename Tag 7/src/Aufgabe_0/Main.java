package Aufgabe_0;

public class Main {
    public static void main(String[] args) {
        Warenkorb w = new Warenkorb();
        w.setVersandArt(new StandardVersand());
        w.setVersandArt(new ExpressVersand());
        new Artikel(2.50, "Chips");
        new Artikel(6.30, "Pizza");
        Artikel.artikelListe.forEach(a -> w.getWarenkorb().put(a, 15));
        w.getGesamtWert();
    }
}