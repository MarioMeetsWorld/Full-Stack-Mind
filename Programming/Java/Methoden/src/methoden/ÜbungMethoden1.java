package methoden;

public class ÜbungMethoden1 {

	public static void main(String[] args) {
		double value1 = 3.547;
		double value2 = 6.354;

		double result = multiplicate(value1, value2);
		System.out.println(result);
	}

	public static double multiplicate(double value1, double value2) {
		double result = value1 * value2;
		return result;
	}

}
