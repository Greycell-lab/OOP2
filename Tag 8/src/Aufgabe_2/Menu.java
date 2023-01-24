package Aufgabe_2;

import java.util.Scanner;

public class Menu {
    private static Schuhfabrik schuhfabrik;
    public static void starteMenu() {
        int auswahl = 0;
        boolean passed;
        System.out.println("Herstellungs-Panel");
        System.out.println("1: Nordfabrik\n2: Südfabrik\n3: Nordsüdfabrik\n");
        do {
            try {
                System.out.print("Wählen sie die Fabrik: ");
                auswahl = Integer.parseInt(new Scanner(System.in).nextLine());
                passed = true;
                if(auswahl > 3 || auswahl < 1){
                    System.out.println("Falsche Auswahl.");
                    passed = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen bitte erneut versuchen");
                passed = false;
            }
        } while (!passed);
        System.out.println();
        switch (auswahl) {
            case 1 -> schuhfabrik = new Nordfabrik();
            case 2 -> schuhfabrik = new Südfabrik();
            case 3 -> schuhfabrik = new Nordsüdfabrik();
        }
        System.out.println("Welcher Schuh soll hergestellt werden: ");
        System.out.println("1: Stiefel\n2: Sandalen\n3: Sportschuhe\n");
        do {
            try {
                System.out.print("Wählen sie die Schuhart: ");
                auswahl = Integer.parseInt(new Scanner(System.in).nextLine());
                passed = true;
                if(auswahl > 3 || auswahl < 1){
                    System.out.println("Falsche Auswahl.");
                    passed = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen bitte erneut versuchen");
                passed = false;
            }
        } while (!passed);
        System.out.println();
        switch(auswahl) {
            case 1 -> schuhfabrik.erzeugeProdukte(Schuhart.STIEFEL);
            case 2 -> schuhfabrik.erzeugeProdukte(Schuhart.SANDALEN);
            case 3 -> schuhfabrik.erzeugeProdukte(Schuhart.SPORTSCHUH);
        }
    }
}
