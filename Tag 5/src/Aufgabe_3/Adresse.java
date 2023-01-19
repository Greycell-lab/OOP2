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
    @Override
    public String toString(){
        return "Name: " + name + "\nStraße: " + strasse + "\nPLZ: " + postleitzahl + " " + stadt + "\nLand: " + land + "\n";
    }

    public String getLand() {
        return land;
    }
}
