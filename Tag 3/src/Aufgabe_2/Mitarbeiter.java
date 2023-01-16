package Aufgabe_2;

import java.util.ArrayList;

public class Mitarbeiter {
    public static ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<>();
    private String name;
    private int nummer;
    private static boolean passed;
    public static StringConverter stringConverter = new StringConverter() {
        @Override
        String toString(Object obj) {
            return "" + ((Mitarbeiter)obj).nummer;
        }

        @Override
        Object fromString(String obj) {
            Mitarbeiter m = null;
            for(var x : mitarbeiter){
                if(toString(x).equals(obj)) {
                    m = x;
                    break;
                }
                else m = null;
            }
            return m;
        }
    };
    public Mitarbeiter(String name, int nummer){
        mitarbeiter.add(this);
        this.name = name;
        this.nummer = nummer;
    }
    public String getName() {
        return name;
    }
}
