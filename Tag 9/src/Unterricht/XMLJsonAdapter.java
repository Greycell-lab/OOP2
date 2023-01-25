package Unterricht;

import Unterricht.Bibliothek.JsonDatei;
import Unterricht.Bibliothek.JsonRoutenBerechnung;
import Unterricht.Bibliothek.XMLDatei;

public class XMLJsonAdapter implements IAdapter{
    public XMLJsonAdapter(JsonRoutenBerechnung jsonRoutenBerechnung) {
        this.jsonRoutenBerechnung = jsonRoutenBerechnung;
    }

    private final JsonRoutenBerechnung jsonRoutenBerechnung;

    @Override
    public XMLDatei convert(XMLDatei daten) {
        JsonDatei json = transformiereXMLZuJson(daten);
        JsonDatei ergebnis = jsonRoutenBerechnung.berechneFahrzeit(json);

        return transformiereJsonZuXML(ergebnis);
    }
    private JsonDatei transformiereXMLZuJson(XMLDatei daten){
        System.out.println("Habe XML-Daten empfangen. Beginne die Transformation zu JSON...");
        JsonDatei json = new JsonDatei();
        json.daten = daten.daten;
        return json;
    }
    private XMLDatei transformiereJsonZuXML(JsonDatei daten){
        System.out.println("Habe JSON-Daten empfangen. Beginne die Transformation zu XML...");
        XMLDatei xml = new XMLDatei();
        xml.daten = daten.daten;
        return xml;

    }
}
