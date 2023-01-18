package Aufgabe_1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    static void bildschirm(String[] daten){
        for (String s : daten) System.out.printf("Gebe '%s' auf Bildschirm aus\n", s);
    };
    static void datei(String[] daten){
        for (String s : daten) System.out.printf("Schreibe '%s' in die Datei\n", s);
    };
    static void datenbank(String[] daten){
        for (String s : daten) System.out.printf("Schreibe '%s' in die Datenbank\n", s);
    };
    public static void main(String[] args) {
        String[] array = {"Steine", "sind", "hart"};
        /*ArrayList<Ausgabe> ausgaben = new ArrayList<>();
        ausgaben.add(Main::bildschirm);
        ausgaben.add(Main::datei);
        ausgaben.add(Main::datenbank);
        ausgaben.forEach(e -> e.ausgeben(array));*/
        Consumer<String[]> consumer = Main::bildschirm;
        consumer = consumer.andThen(Main::datei);
        consumer = consumer.andThen(Main::datenbank);
        consumer.accept(array);
        
    }
}
