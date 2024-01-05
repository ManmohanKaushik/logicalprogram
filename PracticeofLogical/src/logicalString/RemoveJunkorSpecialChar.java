package logicalString;

public class RemoveJunkorSpecialChar {
	public static void main(String[] args) {
		// by regular expression
		String s = "#%^&^&**^*^%$%#$$Manmohan1990";
		String string = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(string);
	}
}
