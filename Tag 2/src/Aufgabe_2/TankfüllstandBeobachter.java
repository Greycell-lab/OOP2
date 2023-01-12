package Aufgabe_2;

public interface TankfüllstandBeobachter {
    static void onTankfüllstandNiedrig(PKW pkw){
        if(pkw.getTankfüllstand() < 10) pkw.getLeuchte().setFarbe("Rot");
    }
}
