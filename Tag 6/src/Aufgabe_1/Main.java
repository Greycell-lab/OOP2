package Aufgabe_1;

import java.util.Random;

public class Main {
    static Random rnd = new Random();
    public static void main(String[] args) {
        SensorDaten daten = new SensorDaten();
        Dashboard dashboard = new Dashboard(daten);
        History history = new History(daten);
        while(true){
            int temp = (int)(rnd.nextDouble(0,45) * 100);
            daten.setMesswert(((double)temp) / 100);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Unterbrochen...");
            }
        }
    }
}
