package Aufgabe_3;

// Einfache Modelklasse (POJO). 
// Wir simulieren eine einfache Kostenberechnungsanwendung. Die entstehenden Kosten werden auf Basis des
// verwendeten Versandanbieters berechnet: Hermes, DHL, UPS. 
// Auf den ersten Blick sieht diese Klasse ganz normal aus. Wir prüfen den Typ der Versendemethode in einer Enumeration
// und rufen dann eine Methode auf, um die Kosten entsprechend zu berechnen. 
// Was könnten die Probleme sein?

public class VersandkostenBerechnung {

		public static void main(String[] args) {
			Bestellung bestellung = new Bestellung(new Adresse("Hendrick", "Zuhause 12", "Dortmund", "12345", "GER"), new Adresse("Gabi", "Wegstraße 12", "Berlin", "54321", "GER"), new VersandUPS());
			System.out.println(bestellung);
			bestellung.setBerechnung(new VersandDHL());
			System.out.println(bestellung);
		}
}
