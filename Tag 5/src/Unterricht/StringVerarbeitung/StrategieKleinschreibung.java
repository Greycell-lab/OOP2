package Unterricht.StringVerarbeitung;

public class StrategieKleinschreibung implements Strategie {
    @Override
    public String erstelleZeichenkette(String s1, String s2){
        return s1.toLowerCase() + s2.toLowerCase();
    }
}
