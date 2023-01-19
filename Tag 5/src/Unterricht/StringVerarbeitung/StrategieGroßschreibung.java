package Unterricht.StringVerarbeitung;

public class StrategieGroßschreibung implements Strategie {
    @Override
    public String erstelleZeichenkette(String s1, String s2) {
        return s1.toUpperCase() + s2.toUpperCase();
    }
}
