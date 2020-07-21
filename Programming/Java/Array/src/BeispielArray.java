import java.util.Scanner;

public class BeispielArray {

	public static void main(String[] args) {
		// Index = Anzahl der Elemente - 1
		// Index = 0 - 5
		int[] lottoZahlen = new int[6];

		// Zu lang
//		lottoZahlen[0] = 30;
//		lottoZahlen[1] = 14;

		for (int i = 0; i < lottoZahlen.length; i++) { // 6 Schleifendruchgänge
			// Scanner für User Input --> Int
			Scanner input = new Scanner(System.in);
			int userInput = input.nextInt();

			// User Input in Array speichern
			lottoZahlen[i] = userInput;
			System.out.println(lottoZahlen[i]);
		}

		// Ausgabe aller Werte in Arrays
		for (int j = 0; j < lottoZahlen.length; j++) {
			System.out.println(lottoZahlen[j]);
		}
	}

}
