package methoden;

public class MethodenReturn {

	public static void main(String[] args) {
		int sum = taschenrechner(5, 5, '+');
		System.out.println(sum);

	}
	
	// int statt void --> Ausgabe soll Ganzzahl sein, nicht nichts
	public static int taschenrechner(int no1, int no2, char operator) {
		
		int sum;
		
		if (operator == '+') {
			sum = no1 + no2; // sum ist lokale Variable und kann somit gleich haben, da nur gültig in Scope
		}else {
			sum = no1 - no2;
		}
		return sum;
	}

}
