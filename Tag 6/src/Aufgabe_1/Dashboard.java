package Aufgabe_1;

import java.time.format.DateTimeFormatter;

public class Dashboard implements IObserver {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
    public Dashboard(SensorDaten daten){
        daten.addObserver(this);
    }
    @Override
    public void update(SensorDaten daten) {
        display(daten);
    }
    private void display(SensorDaten daten){
        System.out.println("Neue Daten: " + daten.getDateTime().format(formatter) + "\n" + daten.getMesswert());
    }
}
