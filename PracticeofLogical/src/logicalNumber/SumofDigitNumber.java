package logicalNumber;

public class SumofDigitNumber {
	public static void main(String[] args) {
		int a = 4567;
		int sum = 0;
		while (a > 0) {
			sum = sum + a % 10;
			a = a / 10;

		}
		System.out.println("The sum of digit is = " + sum);
	}
}
