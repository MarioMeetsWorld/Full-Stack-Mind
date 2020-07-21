
public class Variable {

	public static void main(String[] args) {
		// Abspeicher von Daten <Datentyp> <Variablenname> = <Wert>;
		// Man DEKLARIERT Variablen mit Datentyp & Namen
		// = Zuweisung (Wert ändern) bzw. Intialisierung (Anfangswert setzen)
		// Variablen sind veränderlich
		// Semikolon (;) immer nach Anweisung
		
		int varZahl1 = 3;
		long varZahl2 = 300;
		
		double varZahl3 = 322.33; // Punkt kein Komma, da Englisch
		float varZahl4 = 23.34f; // ohne f denkt java, dass wir eine double in float speichern wollen
		
		boolean userKlick = true;
		
		char zeichen = '!'; // in single quote (char) nicht double quote (string)
		
		varZahl1 = 5;
		
		int highscore = 0; // Intialisierung
		System.out.println(highscore);
		highscore = 10; // Zuweisung
		System.out.println(highscore);
		highscore = 20; // Zuweisung
		System.out.println(highscore);
	}

}
