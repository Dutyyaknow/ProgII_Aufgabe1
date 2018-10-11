package beuth;

import java.util.ArrayList;
import java.util.List;

public class MainProgramm {
	
	public static void main(String[] args) {
		// Daten fuer Studierenden als Strings
		List<String> daten = new ArrayList<String>();
		daten.add("Anna Alt,70001,Medieninformatik");
		daten.add("Bob Berg,70002a,Technische Informatik");
		daten.add("Carla Castor,siebzig tausend und drei,Druck- und Medientechnik");
		daten.add("Daniel Dorf,70004");
		daten.add("Florian Fein,,Technische Informatik");
		daten.add(",70006,Screen Based Media");
		daten.add("Greta Graf,7-00-06");
		daten.add("Horst Heinz,70008,Screen Based Media");
		
		// Eine leere Liste von Student-Objekte erzeugen
		List<Student> studenten = new ArrayList<Student>();
		
		// Zeile fuer Zeile mit den Daten arbeiten,
		// damit einen Student-Objekt erzeugen und in die
		// Liste einfuegen
		for (String datenZeile : daten) {
			String[] teile = datenZeile.split(",");
			
			String name = "";
			int matrikelnummer = 0;
			String studiengang = "";
			
			//---------------------------
			// Beginn: Schreiben bzw. aendern Sie den Code AB hier
			//---------------------------
			try {
				name = teile[0];
				matrikelnummer = Integer.parseInt(teile[1]); 
				studiengang = teile[2];
				
				if(name == null || name.isEmpty()) {
					System.out.println("Name ist leer.");
					System.out.println("Für :" + datenZeile + "\n");
					
				}
				else{
					Student student = new Student(name, matrikelnummer, studiengang);
					studenten.add(student);
				}
					
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Fehler: Zu wenige Daten.");
				System.out.println("Für: " + datenZeile);
				System.out.println(e + "\n");
				
			}
			catch(NumberFormatException e) {
				System.out.println("Fehler: Matrikelnummer hat falsches Format. Nur ganze Zahlen verwenden.");
				System.out.println("Für: " + datenZeile);
				System.out.println(e + "\n");
			}					
			//---------------------------
			// Ende: Schreiben bzw. aendern Sie den Code BIS hier
			//---------------------------
		}
		
		// Zur Bestaetigung, die Liste in der Console drucken
		System.out.println("Liste von Student-Objekten:");
		for (Student student : studenten) {
			System.out.println(student);
		}
	}
}
