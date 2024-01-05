package logicalString;

public class ReversString {
	public static void main(String[] args) {
		String str = "and";
		String rev = "";
		// 1st approach
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		// 2nd approach
		String str1 = "jok";
		String rev1 = "";
		char a[] = str1.toCharArray();
		int arr = a.length;
		for (int i = arr - 1; i >= 0; i--) {
			rev1 = rev1 + str1.charAt(i);

		}
		System.out.println(rev1);

		// 3rd approach
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}
}
