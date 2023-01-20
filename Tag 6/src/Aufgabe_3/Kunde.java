package Aufgabe_3;

public class Kunde{
    private String name;
    private int kundennummer;
    private String telefonnummer;
    public Kunde(String name, int kundennummer, String telefonnummer){
        this.name = name;
        this.kundennummer = kundennummer;
        this.telefonnummer = telefonnummer;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nKundennummer: " + kundennummer + "\nTelefonnummer: " + telefonnummer;
    }
}
