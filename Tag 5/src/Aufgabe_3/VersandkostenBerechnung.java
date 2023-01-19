package Aufgabe_3;

public class VersandkostenBerechnung {

		public static void main(String[] args) {
			Bestellung bestellung = new Bestellung(new Adresse("Hendrick Pilsener", "Zuhause 12", "Dortmund", "12345", "GER"), new Adresse("Gabi Sorglos", "Wegstraße 12", "Berlin", "54321", "GER"), new VersandUPS());
			Bestellung bestellung1 = new Bestellung(new Adresse("Alex Corndog", "Flyingstreet 22", "London", "34535", "ENG"), new Adresse("Molly Smith", "Kornstraße 5", "Frankfurt", "87866", "GER"), new VersandUPS());
			//System.out.println(bestellung);
			//bestellung.setBerechnung(new VersandDHL());
			//System.out.println(bestellung);
			System.out.println(bestellung1);
			bestellung1.setBerechnung(new VersandDHL());
			System.out.println(bestellung1);

		}
}
