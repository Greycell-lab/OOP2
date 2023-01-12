package Aufgabe_1;

abstract class Kreatur {
    private final String name;
    public abstract void angreifen();
    protected Kreatur(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
