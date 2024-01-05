package logicalNumber;

public class CountNumber {

	public static void main(String[] args) {
		int a = 4546787;
		int count = 0;
		while (a > 0) {
			a = a / 10;
			count++;

		}
		System.out.println("The number is present in digit " +count);
	}

}
