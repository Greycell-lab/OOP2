package Aufgabe_0;

import java.time.LocalDate;

public class VeganeWürstchenEtikett extends WürstchenEtikett{
    public VeganeWürstchenEtikett(String name, String[][] zutaten, LocalDate mindesthaltbarkeit){
        super(name, zutaten, mindesthaltbarkeit);
    }
    @Override
    public double getPreis() {
        return 0;
    }
}
