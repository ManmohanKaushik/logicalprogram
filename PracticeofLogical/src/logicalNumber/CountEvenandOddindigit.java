package logicalNumber;

public class CountEvenandOddindigit {

	public static void main(String[] args) {
		int a = 4546787;
		int even = 0;
		int odd = 0;
		while (a > 0) {
			int rev = a % 10;

			if (rev % 2 == 0) {
				even++;
			}

			else {
				odd++;
			}
			a = a / 10;
		}
		System.out.println("The even no present in digit is = " + even);
		System.out.println("The odd no present in digit is = " + odd);

	}
}
