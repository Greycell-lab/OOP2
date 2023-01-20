package Unterricht;

public class WebShopKunde implements Beobachter {
    private final String name;
    public WebShopKunde(String name){
        this.name = name;
    }
    @Override
    public void update(String newsletter) {
        System.out.println("Hallo " + name + "! Neue Nachricht:\n" + newsletter);
    }
}
