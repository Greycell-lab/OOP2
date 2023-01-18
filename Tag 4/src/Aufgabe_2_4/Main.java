package Aufgabe_2_4;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Dampfschifffahrtsgesellschaft", "EDV", "Schneeeule"};
        PrüfeStrings a = PrüfeStrings::A_IstLängerAls_B;
        PrüfeStrings b = PrüfeStrings::A_HatMehrEAls_B;
        PrüfeStrings c = (s1, s2) -> s1.length() > s2.length();
        //PrüfeStrings.Sortiere(arr, a);
        PrüfeStrings.Sortiere(arr, c);
        PrüfeStrings.Ausgabe(arr);
    }
}
