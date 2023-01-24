package Unterricht;

public class SeeFrachtBriefFabrik extends AuftragFabrik{
    @Override
    public Transportauftrag erzeugeTransportauftrag(String auftragsdaten) {
        System.out.println("Neuer SeeFrachtBrief mit den daten -> " + auftragsdaten + " <- wird erstellt.");
        return new SeeFrachtBrief();
    }
}
