package Aufgabe_0;

public class Adapter implements TemperaturAdapter {
    @Override
    public double convert(TemperaturSensor kelvin) {
        return ((int)((kelvin.getKelvin() - 273.15) * 100))/100.0;
    }
}
