package methoden;

public class BeispielMethode {

	public static void main(String[] args) {
		int enemyLife = 100;
		System.out.println("Leben vorher: " + enemyLife);

		// Updaten des Werts durch Methode
		enemyLife = enemyHit(enemyLife);
		System.out.println("Leben nach Treffer: " + enemyLife);

		// Updaten des Werts durch Methode
		enemyLife = enemyHit(enemyLife);
		System.out.println("Leben nach Treffer: " + enemyLife);

		// Updaten des Werts durch Methode
		enemyLife = enemyHit(enemyLife);
		System.out.println("Leben nach Treffer: " + enemyLife);

		// Updaten des Werts durch Methode
		enemyLife = enemyHit(enemyLife);
		System.out.println("Leben nach Treffer: " + enemyLife);

		// Updaten des Werts durch Methode
		enemyLife = enemyHit(enemyLife);
		System.out.println("Leben nach Treffer: " + enemyLife);

	}

	public static int enemyHit(int currentLife) {
		int newLife;
		newLife = currentLife - 20;
		return newLife;
	}
}
