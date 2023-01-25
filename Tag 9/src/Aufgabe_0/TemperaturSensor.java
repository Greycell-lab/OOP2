package Aufgabe_0;

import java.util.Random;

public class TemperaturSensor {
    static Random rnd = new Random();
    private double temperatur;
    public TemperaturSensor() {
        double temp = rnd.nextDouble(250, 350) * 100;
        this.temperatur = ((int)temp)/100.0;
    }
    public double getKelvin() {
        return temperatur;
    }
}
