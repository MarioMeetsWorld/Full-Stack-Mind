
public class Operatoren2 {

	public static void main(String[] args) {
		/*
		 * Vergleichoperatoren werden oft mit if / else Konstruktoren verwendet
		 * z.B.
//		 * if {
		 * Wenn Bedingung true wird der Bereich ausgef�hrt
		 *} 	
		 */
		
		// Vergleichsoperatoren
		
		int d = 1;
		int e = 3;
		boolean f;
		
		f = d == e;
		System.out.println(f);
		
		int g = 1;
		int h = 3;
		boolean l;
		
		l = g < h;
		System.out.println(f);
		
		// Beispiel
		
		int lebenGegner = 5;
		boolean hit = true;
		
		
		if (lebenGegner == 0 && hit == true) { // k�nnte auch || sein f�r oder
		System.out.println("zerst�rt");
		} else {
			System.out.println("Gegner hat noch " + lebenGegner + " leben");
		}

	}
}
