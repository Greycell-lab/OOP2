package Aufgabe_0;

public class Main {
    public static void main(String[] args) {
        Aktion a = () -> Programm.schwimmen();
        Aktion b = () -> Programm.laufen();
        Sportler rolf = new Sportler();
        rolf.führeAktionAus(a);
        rolf.führeAktionAus(b);
    }
}