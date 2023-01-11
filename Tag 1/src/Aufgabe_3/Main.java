package Aufgabe_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Speise spaghetti = new Speise("Spaghetti", 2.50, new ArrayList<String>(Arrays.asList("Nudeln", "Soße")));
        Getränk cola = new Getränk("Cola", 1.50, 250);
        System.out.println(spaghetti);
        System.out.println();
        System.out.println(cola);
    }
}
