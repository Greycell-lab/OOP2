package Aufgabe_3;

import java.util.HashMap;

public class Werkstatt implements Observer{
    static HashMap<Fahrzeug, Kunde> aufträge = new HashMap<>();
    public void setAufträge(Fahrzeug fahrzeug, Kunde kunde){
        aufträge.put(fahrzeug, kunde);
    }
    @Override
    public void sendeSMS(Kunde kunde) {
        System.out.println("SMS an: " + kunde.getTelefonnummer() + "gesendet");
    }
    public void setBearbeitung(Fahrzeug fahrzeug){
        fahrzeug.setBearbeitet(true);
        notifyObservers(fahrzeug);
    }
    public void notifyObservers(Fahrzeug fahrzeug){
        fahrzeug.getObservers().forEach(f -> f.sendeSMS(aufträge.get(fahrzeug)));
    }
}
