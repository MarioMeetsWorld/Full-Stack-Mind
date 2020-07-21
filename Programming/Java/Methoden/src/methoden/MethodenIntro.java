package methoden;

public class MethodenIntro {
	public static void main(String[] args) {
		method1();
	}
	
	// Methode --> erleichtert wiederholende Aufaben --> Uebernimmt 1 spezifische Aufgabe
	/* 
	* Parameterliste = namen / lebenspunkte / grafik, die genutzt wird
	* 
	* Modifikator Rueckgabetyp Methodennamen (Datentyp Parameter 1, Datentype Paremeter 2)
	* Modifikator gibt Sichtbereich der Methode an --> public / private / protected
	* Methode --> Erledigt 1 bestimmte Aufgabe
	* 
	* void = leer
	* return = Rückgabe
	* 
	* Aufbau ohne Rueckgabewert
	* public void methodeName(Parameterliste) {
	* Anweisungsblock	
	*}
	*/
	public static void method1() {
		System.out.println("Ich bin eine Methode.");
	}
		
	
	/*
	* Aufbau mit Rueckgabewert
	* public int methodeName(Parameterliste) {
	* Anweisungsblock
	* return ergebnisWert;	
	*} 
	*/ 
	public static void method2() {
		int a,b,methode2;
		a = 1;
		b = 2;
		
		methode2 = a + b;
		System.out.println(methode2);
	}
}
