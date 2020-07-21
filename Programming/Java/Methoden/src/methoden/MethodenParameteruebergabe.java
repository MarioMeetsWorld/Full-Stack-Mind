package methoden;

public class MethodenParameteruebergabe {
	
	public static void main(String[] args) {
		createEnemy("Peter", 100);
		createEnemy("Mario", 100);
		createEnemy("Mark", 100);
	}

	public static void createEnemy(String name, int energyPoints) {
		String enemyName = name;
		int enemyEnergyPoints = energyPoints;
		System.out.println("Gegner erstellt " + enemyName + " mit " + enemyEnergyPoints + " Energiepunkten.");
	}

}
