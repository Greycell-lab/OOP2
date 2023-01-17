package Aufgabe_2_4;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Dampfschifffahrtsgesellschaft", "EDV", "Schneeeule"};
        Aufgabe_2.PrüfeStrings a = Aufgabe_2.PrüfeStrings::A_IstLängerAls_B;
        Aufgabe_2.PrüfeStrings b = Aufgabe_2.PrüfeStrings::A_HatMehrEAls_B;
        Aufgabe_2.PrüfeStrings c = (s1, s2) -> s1.length() > s2.length();
        //PrüfeStrings.Sortiere(arr, a);
        Aufgabe_2.PrüfeStrings.Sortiere(arr, c);
        Aufgabe_2.PrüfeStrings.Ausgabe(arr);
    }
}
