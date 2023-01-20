package Aufgabe_4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Bäckerei bäckerei = new Bäckerei();
        Familie familie = new Familie();
        Kunde sven = new Kunde("Sven", LocalDate.of(2023,01,25), "Minze");
        Kunde marge = new Kunde("Marge", LocalDate.of(2023,01,29), "Himbeere");
        Kunde lisa = new Kunde("Lisa", LocalDate.of(2023, 01, 31), "Zitrone");
        sven.addObserver(bäckerei);
        marge.addObserver(bäckerei);
        marge.addObserver(familie);
        lisa.addObserver(bäckerei);
        while(true) {
            System.out.println("Heutiges Datum: " + today);
            for(var x : Kunde.kunden){
                if (today.isEqual(x.getGeburtstag())) x.notifyObserver();
            }
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Unterbrochen...");
            }
            today = today.plusDays(1);
        }

    }
}
