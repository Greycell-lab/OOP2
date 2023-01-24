package Aufgabe_1;

public class MarsFabrik extends Fabrik {
    @Override
    public Pizza erstellePizza(String sorte) {
        if(sorte.toLowerCase().equals("salami")) return new MarsSalamiPizza();
        if(sorte.toLowerCase().equals("schinken")) return new MarsSchinkenPizza();
        else return  null;
    }
}
