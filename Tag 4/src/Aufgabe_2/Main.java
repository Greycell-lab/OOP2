package Aufgabe_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Dampfschifffahrtsgesellschaft", "EDV", "Schneeeule"};
        PrüfeStrings a = (s1, s2) -> PrüfeStrings.A_IstLängerAls_B(s1, s2);
        PrüfeStrings b = (s1, s2) -> PrüfeStrings.A_HatMehrEAls_B(s1, s2);
        //PrüfeStrings.Sortiere(arr, a);
        PrüfeStrings.Sortiere(arr, b);
        PrüfeStrings.Ausgabe(arr);
    }
}
