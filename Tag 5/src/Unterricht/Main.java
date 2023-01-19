package Unterricht;

import Unterricht.StringVerarbeitung.*;

public class Main {

    //Client-Class
    public static void main(String[] args) {
        Strategie s1 = new StrategieNormal();
        Strategie s2 = new StrategieGroßschreibung();
        Strategie s3 = new StrategieKleinschreibung();
        Strategie s4 = (string1, string2) -> string2 + string1;
        Kontext kontext = new Kontext(s1);
        System.out.println(kontext.erstelleZeichenkette("Das ist eine normale ", "Zeichenkette"));
        kontext.setStrategie(s2);
        System.out.println(kontext.erstelleZeichenkette("Das ist eine großgeschriebene ", "Zeichenkette"));
        kontext.setStrategie(s3);
        System.out.println(kontext.erstelleZeichenkette("Das ist eine kleingeschriebene ", "Zeichenkette"));
        kontext.setStrategie(s4);
        System.out.println(kontext.erstelleZeichenkette("Das ist eine verdrehte ", "Zeichenkette"));
    }
}
