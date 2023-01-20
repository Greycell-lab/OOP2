package Aufgabe_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class SensorDaten {
    private double messwert;
    private LocalDateTime dateTime;
    public SensorDaten(double messwert){
        this.messwert = messwert;
        dateTime = LocalDateTime.now();
    }
    private ArrayList<IObserver> observerListe = new ArrayList<>();
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
    public void notifyObservers(){
        observerListe.forEach(o -> o.update(this));
    }
    public double getMesswert(){
        return messwert;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
