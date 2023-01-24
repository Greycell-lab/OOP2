package Aufgabe_1;

public class VenusFabrik extends Fabrik {
    @Override
    public Pizza erstellePizza(String sorte) {
        if(sorte.toLowerCase().equals("salami")) return new VenusSalamiPizza();
        if(sorte.toLowerCase().equals("schinken")) return new VenusSchinkenPizza();
        else return  null;
    }
}
