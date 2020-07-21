
public class ArrayIntro {

	public static void main(String[] args) {
		// Variable Deklaration
		// Datentyp Name = Wert;
		int zahl = 10;
		double zahl1 = 34.45;

		// Array Deklaration
		// Daten[] Name = new Datentyp[Anzahl]
		// Statisch --> größe muss vorab definiert werden
		int[] arr1 = new int[7];
		arr1[3] = 50;
		arr1[5] = 500;
		arr1[0] = 40;

		double[] arr2 = new double[7]; // 1. Nur das Array erstellt
		arr2[1] = 35.23; // 2. Werte zuweisen
		arr2[2] = 50.45;
		
		// Sofort Werte zuweisen
		String [] personA = {"Peter","Müller", "35"};
		System.out.println("Name: " + personA[0]); // ="Peter"
	}

}
