
public class Typumwandlung_Casten {

	public static void main(String[] args) {
		// Casten = Typumwandlug
		
		int userAlter = (int)18.5; // (int) --> Cast Operator --> 18
		System.out.println(userAlter);
		
		// Implizites Casten = von klein nach groß --> Impact: Kein Datenverlust
		// Umwandlung findet bei Zuweisung statt
		
		int zahl1 = 30;
		double zahl2 = zahl1;
		System.out.println(zahl2);

		// Explizites Casten = von groß zu klein --> Impact: Datenverlust
		// Umwandlung findet m.H.d. Cast Operator statt
		
		int autoPreis = (int)3450.60; // = 3450
		int autoPreis2 = (int)2690.94; // = 2690
		
		int summePreise = autoPreis + autoPreis2;
		System.out.println(summePreise);
	}

}
