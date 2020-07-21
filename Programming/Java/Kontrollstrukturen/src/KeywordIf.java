
public class KeywordIf {

	public static void main(String[] args) {
		int score = 50;
		if (score == 100) {
			System.out.println("Won");
		}else {
			System.out.println("not Won");
		}
		
		
		boolean hit = false;
		int highscore = 2;
		
		if(hit == true){ // somit false weil nicht hit = false nicht = true
			System.out.println("Won");
			highscore += 10;
			System.out.println("Highscore: " + highscore);
		}else {
			System.out.println("Didn't Hit");
		}
	}

}
