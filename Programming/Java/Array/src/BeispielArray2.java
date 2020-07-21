import java.util.Scanner;

public class BeispielArray2 {

	public static void main(String[] args) {
		String[] quizFragen = { "Wieviel ist 5+4?", "Wie viel ist 3*4?" };

		int[] answers = { 9, 15 };

		int count = 0;
		while (count < quizFragen.length) {
			System.out.println(quizFragen[count]);

			Scanner scan = new Scanner(System.in);
			int userInput = scan.nextInt();

			if (userInput == answers[count]) {
				System.out.println("Richtig.");
				count++;
			} else {
				System.out.println("Falsch.");
			}
		}
	}

}
