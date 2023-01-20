package Unterricht;

public class Main {
    public static void main(String[] args) {
        WebShop shop = new WebShop();
        shop.beobachterHinzufügen(new WebShopKunde("Sven"));
        shop.beobachterHinzufügen(new WebShopKunde("Karl"));
        shop.newsletterVersenden("Hi was geht ab leute heute wieder 100 Druckerpatronen im Angebot für 49,99!");
    }
}