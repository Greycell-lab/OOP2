package Aufgabe_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Speise("Spaghetti", 2.50, new ArrayList<>(Arrays.asList("Nudeln", "Soße")));
        new Getränk("Cola", 1.50, 250);
        for(var x : Imbiss.getListe()) System.out.println(x);
    }
}
