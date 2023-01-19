package Aufgabe_3;

public class Adresse {

    private final String name;
    private final String strasse;
    private final String stadt;
    private final String postleitzahl;
    private final String land;

    Adresse(String name, String strasse, String stadt, String postleitzahl, String land){
        this.name = name;
        this.strasse = strasse;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
        this.land = land;
    }
    public String getLand() {
        return land;
    }

    public String getName() {
        return name;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getStadt() {
        return stadt;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }
}
