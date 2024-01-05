package logicalNumber;

import java.util.Random;

public class GenrateRandomNoandStr {
	public static void main(String[] args) {

		Random random = new Random();
		int i = random.nextInt(999);
		System.out.println(i);

		long l = random.nextLong();
		System.out.println(l);
// 2nd Approach 
		System.out.println(Math.random());
	}
}
