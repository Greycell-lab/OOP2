package Aufgabe_0;

public class Main {
    public static void main(String[] args) {
        TemperaturSensor sensor = new TemperaturSensor();
        TemperaturAdapter adapter = new Adapter();
        System.out.println("Temperatur in Kelvin: " + sensor.getKelvin());
        System.out.println("Temperatur in Celcius " + adapter.convert(sensor));
    }
}
