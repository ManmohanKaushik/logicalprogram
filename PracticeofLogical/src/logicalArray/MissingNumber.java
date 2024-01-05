package logicalArray;

public class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 12, 14, 16, 18, 20 };
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("The sum of array is " + sum1);
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			int j = 2 * i;
			sum2 = sum2 + j;
		}
		System.out.println("The sum of range(table of 2) is " + sum2);
		System.out.println("The missing number is " + (sum2 - sum1));
	}
}
