package Aufgabe_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.format.DateTimeFormatter;

public class History implements IObserver {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
    public History(SensorDaten daten){
        daten.addObserver(this);
    }
    @Override
    public void update(SensorDaten daten) {
        System.out.println("Neue Daten werden gespeichert...");
        save(daten);
    }
    public void save(SensorDaten daten){
        try (OutputStream stream = new FileOutputStream("sensordaten.txt", true)){
            String messdaten = daten.getDateTime().format(formatter) + " --> " + daten.getMesswert() + "\n";
            stream.write(messdaten.getBytes());
            System.out.println("Gespeichert");
        }catch(FileNotFoundException e){
            System.out.println("Datei nicht gefunden...");
        }catch(IOException e){
            System.out.println("Fehler beim Schreiben der Datei...");
        }
    }
}
