package Aufgabe_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Speise("Spaghetti", 2.50, Arrays.asList("Nudeln", "Soße", "Parmesan"));
        new Getränk("Cola", 1.50, 250);
        for(var x : Waren.getListe()) System.out.println(x);
    }
}
