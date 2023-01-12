package Aufgabe_2;

public class PKW {
    private TankfüllstandLeuchte leuchte = new TankfüllstandLeuchte("Rot");
    public static TankfüllstandBeobachter beobachter;
    private int tankfüllstand;

    public PKW(int tankfüllstand) {
        this.tankfüllstand = tankfüllstand;
    }

    public void addTankfüllstand(int tankfüllung) {
        if (this.tankfüllstand >= 15) this.leuchte.setFarbe("Grün");
    }

    public void fahren() {
        while (this.tankfüllstand > 0) {
            System.out.println("Brumm...");
            this.tankfüllstand -= 1;
            if (this.tankfüllstand < 15) this.leuchte.setFarbe("Gelb");
        }
    }

    public void onTankfüllstandNiedrig() {
        TankfüllstandBeobachter.onTankfüllstandNiedrig(this);
    }

    public TankfüllstandLeuchte getLeuchte() {
        return leuchte;
    }

    public int getTankfüllstand() {
        return tankfüllstand;
    }

}