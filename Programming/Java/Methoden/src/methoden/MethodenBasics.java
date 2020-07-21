package methoden;

public class MethodenBasics {

	public static void main(String[] args) {
		// Modifikator Rueckgabetyp Methodennamen (Datentyp Parameter 1, Datentype Paremeter 2)
		// Modifikator gibt Sichtbereich der Methode an --> public / private / protected
		// Methode --> Erledigt 1 bestimmte Aufgabe
		
		
		// Alter Weg --> 10mal erstellen
		/* String enemyName = "Peter";
		* int enemyLife = 100;
		* String enemyName2 = "Peter";
		* int enemyLife2 = 100;
		* String enemyName3 = "Peter";
		* int enemyLife3 = 100;
		* String enemyName4 = "Peter";
		* int enemyLife4 = 100;
		* String enemyName5 = "Peter";
		* int enemyLife5 = 100;
		* String enemyName6 = "Peter";
		* int enemyLife6 = 100;
		* String enemyName7 = "Peter";
		* int enemyLife7 = 100;
		* String enemyName8 = "Peter";
		* int enemyLife8 = 100;
		* String enemyName9 = "Peter";
		* int enemyLife9 = 100;
		* String enemyName10 = "Peter";
		* int enemyLife10 = 100;
		*/
		
		// Neuer Weg --> 10mal erstellen
		for (int i = 0; i <= 10; i++) {
			createEnemy();
		}

	}

	public static void createEnemy() {
		String enemyName = "Peter";
		int enemyLife = 100;
		System.out.println("Gegner erstellt.");
	}

}
