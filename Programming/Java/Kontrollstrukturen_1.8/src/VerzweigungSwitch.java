import java.util.Scanner;

public class VerzweigungSwitch {

	public static void main(String[] args) {
		// Switch = Fallunterscheidung
		// Case = Der Fall
		// als Bedingung gilt nur ein int, char oder String
		
		int zahl = 5;
		switch (zahl) {
		case 0:{
			System.out.println("Die Zahl ist eine 0.");
		}break; // verlassen der Anweisung bei Zutreffen
		case 3:{
			System.out.println("Die Zahl ist eine 3.");
		}break;
		case 5:{
			System.out.println("Die Zahl ist eine 5.");
		}break;
		}
		
		
		// Anwendung in Quiz
		
		System.out.println("Wieviele Bundesländer hat Deutschland?");
		System.out.println("20, 16 oder 23?");
		
		Scanner scan = new Scanner(System.in);
		int inputUser = scan.nextInt();
		scan.close();
		
		switch (inputUser) {
		case 16:{
			System.out.println("Richtig.");
		}break;
		case 20:{
			System.out.println("Falsch.");
		}break;
		case 23:{
			System.out.println("Falsch.");
		}break;
		default:{
			System.out.println("Das ist keine zulässige Antwort.");
		}
		
		}
		
		
	}
	
}
