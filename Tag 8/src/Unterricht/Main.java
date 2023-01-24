package Unterricht;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuftragFabrik fabrik = null;
        Transportauftrag auftrag = null;
        int auswahl;
        System.out.println("Transport");
        System.out.println("1: Land-Frachtbrief\n2: Luft-Frachtbrief\n3: See-Frachtbrief");
        try {
            auswahl = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(auswahl) {
                case 1 -> fabrik = new LandFrachtBriefFabrik();
                case 2 -> fabrik = new LuftFrachtBriefFabrik();
                case 3 -> fabrik = new SeeFrachtBriefFabrik();
            }
            if(fabrik != null) {
                auftrag = fabrik.erzeugeTransportauftrag("Ziel: England");
                auftrag.ausliefern();
            }
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }


    }
}
