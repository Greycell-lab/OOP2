package Aufgabe_2;

public class Fahrer implements TankfüllstandBeobachter {
    public static void tanken(PKW pkw){
        pkw.addTankfüllstand(5);
    }
    public static void onTankfüllstandNiedrig(PKW pkw){
        if(pkw.getLeuchte().equals("Gelb")) System.out.println("Ach, hat noch Zeit...");
        if(pkw.getLeuchte().equals("Rot")) {
            System.out.println("Jetzt aber dringend tanken...");
            tanken(pkw);
        }
    }
}
