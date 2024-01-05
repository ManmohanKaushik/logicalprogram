package logicalNumber;

public class FindLargerestNo {
	public static void main(String[] args) {
		// 1st approach
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b && a > c) {
			System.out.println(a + " is greater then both ");
		} else if (b > a && b > c) {
			System.out.println(b + " is greater then both ");
		} else {
			System.out.println(c + " is greater then both ");
		}

		// 2nd approach
		int d = 85;
		int e = 555;
		int f = 165;
		int lar = d > e ? d : e;
		int larg = f > lar ? f : lar;
		System.out.println(larg + " is greater then both ");
	}
}
