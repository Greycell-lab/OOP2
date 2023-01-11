package Aufgabe_1;

public abstract class Kreatur {
    private final String name;
    public abstract void angreifen();
    public Kreatur(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
