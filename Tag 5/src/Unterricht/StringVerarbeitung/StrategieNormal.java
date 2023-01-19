package Unterricht.StringVerarbeitung;

public class StrategieNormal implements Strategie {
    @Override
    public String erstelleZeichenkette(String s1, String s2) {
        return s1 + s2;
    }
}
