package Unterricht;

public class LandFrachtBriefFabrik extends AuftragFabrik {

    @Override
    public Transportauftrag erzeugeTransportauftrag(String auftragsdaten) {
        System.out.println("Neuer LandFrachtBrief mit den daten -> " + auftragsdaten + " <- wird erstellt.");
        return new LandFrachtBrief();
    }
}
