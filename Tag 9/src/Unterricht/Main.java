package Unterricht;

import Unterricht.Bibliothek.JsonRoutenBerechnung;
import Unterricht.Bibliothek.XMLDatei;

public class Main {
    public static void main(String[] args) {
        IAdapter adapter = new XMLJsonAdapter(new JsonRoutenBerechnung());
        XMLDatei xml = new XMLDatei();
        xml.daten = "Hallo";
        XMLDatei xml1 = adapter.convert(xml);
        System.out.println("Inhalt der empfangenen XML-Datei: " + xml1.daten);
    }
}
