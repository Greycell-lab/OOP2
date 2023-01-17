package Aufgabe_5;

import java.util.Random;
import java.util.function.Predicate;

public class Main {
    static Random rnd = new Random();
    public static void main(String[] args) {
        Predicate<Kunde> predicate = nummer -> Kunde.kunden.contains(rnd.nextInt(1, 11));
        for(int i=0;i<10;i++){
        }
    }
}
