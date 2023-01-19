package Aufgabe_3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tee");
        list.add("Auto");
        list.add("Gitarre");
        list.add("Abrakadabra");
        list.add("Java ist auch eine ganz gute Programmiersprache");
        System.out.println(list);
        Predicate<String> predicate = (string) -> string.length() < 15;
        System.out.println("Gelöscht: " + meinRemoveAll(list, predicate));
        System.out.println(list);
    }
    public static int meinRemoveAll(ArrayList<String> liste, Predicate<String> predicate) {
        int count = 0;
        int zähler = 0;
        while (zähler < liste.size()) {
            if (predicate.test(liste.get(zähler))) {
                liste.remove(zähler);
                count++;
            }
            else zähler++;
        }
        return count;
    }
}