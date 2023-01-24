package Aufgabe_1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SensorDaten {
    private final ArrayList<IObserver> observerListe = new ArrayList<>();
    private double messwert;
    private LocalDateTime dateTime;
    public void addObserver(IObserver observer){
        observerListe.add(observer);
    }
    public void removeObserver(IObserver observer){
        observerListe.remove(observer);
    }
    public void setMesswert(double messwert){
        this.messwert = messwert;
        dateTime = LocalDateTime.now();
        notifyObservers();
    }
    private void notifyObservers(){
        observerListe.forEach(o -> o.update(this));
    }
    public double getMesswert(){
        return messwert;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

}
