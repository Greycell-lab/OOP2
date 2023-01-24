package Aufgabe_1;

public class Main {
    static Fabrik fabrik = null;
    static Pizza pizza = null;
    public static void main(String[] args) {
        fabrik = new MarsFabrik();
        pizza = fabrik.erstellePizza("salami");
        System.out.println(pizza);
        fabrik = new VenusFabrik();
        pizza = fabrik.erstellePizza("schinken");
        System.out.println(pizza);
    }
}
