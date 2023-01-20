package Unterricht;

import java.util.ArrayList;

public class WebShop {
    public final ArrayList<Beobachter> beobachterListe = new ArrayList<>();
    public void beobachterHinzufügen(Beobachter beobachter){
        beobachterListe.add(beobachter);
    }
    public void beobachterEntfernen(Beobachter beobachter){
        beobachterListe.remove(beobachter);
    }
    public void newsletterVersenden(String newsletter){
        beobachterListe.forEach(b -> b.update(newsletter));
    }


}
