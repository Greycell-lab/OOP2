package Aufgabe_1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Steine", "sind", "hart"};
        Ausgabe a  = arr -> Ausgabe.bildschirm(arr);
        Ausgabe b = arr -> Ausgabe.datei(arr);
        Ausgabe c = arr -> Ausgabe.datenbank(arr);
        a.ausgeben(array);
        b.ausgeben(array);
        c.ausgeben(array);
    }
}
