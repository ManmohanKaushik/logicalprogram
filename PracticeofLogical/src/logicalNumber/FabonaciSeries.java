package logicalNumber;

public class FabonaciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a + " " + b);
		for (int i = 2; i < 10; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;

		}
		System.out.println("...");
		/*int n1 = 0;
		int n2 = 1;
		int m;
		for (int i = 1; i <= 10; i++) {
			m = n1 + n2;
			System.out.print(" " + m);
			n1 = n2;
			n2 = m;
		}*/
	}

}
