import java.util.Scanner;

public class VerzweigungQuiz {

	public static void main(String[] args) {
		System.out.println("Wieviele Bundesländer hat Deutschland?");
		System.out.println("20, 16 oder 23?");
		
		Scanner scan = new Scanner(System.in);
		int inputUser = scan.nextInt();
		scan.close();
		
		if (inputUser == 16) {
			System.out.println("Das ist richtig!");
		}else if (inputUser != 16) {
			System.out.println("Das ist falsch!");
		}
		
		
		
	}

}
