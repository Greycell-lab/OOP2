package Aufgabe_4;

public class Familie implements Observer {
    @Override
    public void update(Kunde kunde) {
        System.out.println("Liebe/r " + kunde.getName() + " du hast heute Geburtstag. Deine Familie wünscht dir Alles Gute :)");
    }
}
