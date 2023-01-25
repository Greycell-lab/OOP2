package Aufgabe_1;

import Aufgabe_1.Bibliothek.QuadratischerStöpsel;

public class Main {
    public static void main(String[] args) {
        RundesLoch loch = new RundesLoch(5.00);
        RunderStöpsel rund = new RunderStöpsel(4.00);
        QuadratischerStöpsel quadrat = new QuadratischerStöpsel(10);
        System.out.println("Der runde Stöpsel " + (rund.getRadius() < loch.getRadius() ? "passt" : "passt nicht") + " in das Loch mit einem Radius " + loch.getRadius() + " denn der Radius des runden Stöpsels beträgt " + rund.getRadius());
        System.out.println("Der quadratische Stöpsel " + new QuadratischZuRundAdapter(quadrat).prüfeStöpsel(loch) + " in das Loch mit einem Radius " + loch.getRadius() + " denn der Radius des quadratischen Stöpsels beträgt " + new QuadratischZuRundAdapter(quadrat).convert());
    }
}
