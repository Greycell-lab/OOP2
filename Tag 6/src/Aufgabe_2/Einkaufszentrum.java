package Aufgabe_2;

import java.util.ArrayList;

public class Einkaufszentrum {
    private ArrayList<Grüßbar> grüßbarListe = new ArrayList<>();
    public void neuerKundeBetrittDasGebäude(){
        grüßbarListe.forEach(g -> g.grüßen());
    }
    public void grüßbarHinzufügen(Grüßbar grüßbar){
        grüßbarListe.add(grüßbar);
    }
    public void grüßbarEntfernen(Grüßbar grüßbar){
        grüßbarListe.remove(grüßbar);
    }
}
