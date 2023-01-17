package Aufgabe_1;
@FunctionalInterface
public interface Ausgabe {
    void ausgeben(String[] daten);
    static void bildschirm(String[] daten){
        for(int i=0;i<daten.length;i++) System.out.printf("Gebe '%s' auf Bildschirm aus\n", daten[i]);
    };
    static void datei(String[] daten){
        for(int i=0;i<daten.length;i++) System.out.printf("Schreibe '%s' in die Datei\n", daten[i]);
    };
    static void datenbank(String[] daten){
        for(int i=0;i<daten.length;i++) System.out.printf("Schreibe '%s' in die Datenbank\n", daten[i]);
    };

}
