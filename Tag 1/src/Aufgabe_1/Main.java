package Aufgabe_1;

public class Main {
    public static void main(String[] args) {
        Ritter r = new Ritter("Lanzelot");
        Drache d = new Drache("Nefarian");
        System.out.println(d.getName() + "greift an");
        d.angreifen();
        System.out.println(r.getName() + "greift an");
        r.angreifen();
    }
}
