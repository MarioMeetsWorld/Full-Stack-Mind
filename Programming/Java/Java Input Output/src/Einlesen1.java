import java.util.Scanner;

public class Einlesen1 {

	public static void main(String[] args) {
		
		/*
		 * Was kann eingelesen werden?
		 * 
		 * nextInt() - Int
		 * nextFloat() - Float
		 * nextDouble() - Double
		 * nextLong() - Long
		 * nextShort() - Short
		 * next() - Char (Einzelnes Wort) 
		 * nextLine() - String "Zeichenkette"
		 * nextBoolean() - Boolean
		 */
		
		// Klasse = Komplexer Datentyp --> gespeichert mehr als eine Information
		Scanner scan = new Scanner(System.in); // Systen.in = Input-Stream = Tastatur
		System.out.println("Bitte eine Zahl eintippen: ");
		double zahl = scan.nextDouble();
		System.out.println("Ihre Zahl lautet " + zahl);
		scan.close(); // Abschluss der Eingabe --> Sonst Fehlermeldung
		
		
		
		
		// <Klasse> variable, die neuen Wert bekommt = Objekt wird erstellt
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Geben Sie ihren Namen ein: ");
		String zeichenkette = scan2.next();
		System.out.println("Bitten geben Sie ihr alter ein: ");
		int alter = scan2.nextInt();
		scan2.close();
		
		System.out.println("Ihr Name: " + zeichenkette + " Ihr Alter: " + alter);
	}

}
