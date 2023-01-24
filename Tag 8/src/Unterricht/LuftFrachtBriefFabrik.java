package Unterricht;

public class LuftFrachtBriefFabrik extends AuftragFabrik{
    @Override
    public Transportauftrag erzeugeTransportauftrag(String auftragsdaten) {
        System.out.println("Neuer LuftFrachtBrief mit den daten -> " + auftragsdaten + " <- wird erstellt.");
        return new LuftFrachtBrief();
    }
}
