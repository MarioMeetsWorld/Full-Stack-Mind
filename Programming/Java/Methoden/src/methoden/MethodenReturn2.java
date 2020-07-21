package methoden;

public class MethodenReturn2 {

	public static void main(String[] args) {
		int sum = sum();
		System.out.println("Der errechnete Wert ist " + sum);
		
		int result = sum - 5;
		System.out.println("Der Wert der Summe ist " + result);
	}
	// Summe errechnen
	public static int sum() {
		int a, b, sum;
		a = 5;
		b = 5;

		sum = a + b;
		// lokale Variablen werden nach Ausführung der Methode gelöscht --> mit Return kann man es sichern 
		return sum;
	}
}
