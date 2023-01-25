package Unterricht.Bibliothek;

public class JsonRoutenBerechnung {
    public JsonDatei berechneFahrzeit(JsonDatei jsonDaten){
        System.out.println("Die Bibliothek hat folgende JSON Daten erhalten: " + jsonDaten.daten);
        JsonDatei ergebnis = new JsonDatei();
        ergebnis.daten  = "DIe Fahrzeit beträgt 12 Minuten und 37 Sekunden.";
        return ergebnis;
    }
}
