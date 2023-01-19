package Aufgabe_3;

public class VersandkostenBerechnung {

		public static void main(String[] args) {
			Adresse empfänger = new Adresse("Hendrick Pilsener", "Zuhause 12", "Dortmund", "12345", "GER");
			Adresse herkunft = new Adresse("Gabi Sorglos", "Wegstraße 12", "Berlin", "54321", "GER");
			Versand versand = new Versand(empfänger, herkunft, new VersandUPS());
			Adresse empfänger1 = new Adresse("Alex Corndog", "Flyingstreet 22", "London", "34535", "ENG");
			Adresse herkunft1 = new Adresse("Molly Smith", "Kornstraße 5", "Frankfurt", "87866", "GER");
			Versand versand1 = new Versand(empfänger1, herkunft1, new VersandUPS());
			//System.out.println(bestellung);
			//bestellung.setBerechnung(new VersandDHL());
			//System.out.println("-----------------------------------------");
			//System.out.println(bestellung);
			System.out.println(versand1);
			versand1.setBerechnung(new VersandAPL());
			System.out.println("-----------------------------------------");
			System.out.println(versand1);

		}
}
