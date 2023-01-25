package Aufgabe_1;

public abstract class Pizza {
    @Override
    public String toString(){
        return "Pizza " + this.getClass().getSimpleName() + " wurde gebacken";
    }
}
