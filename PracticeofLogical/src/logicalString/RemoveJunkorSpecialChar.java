package logicalString;

public class RemoveJunkorSpecialChar {
	public static void main(String[] args) {
		// by regular expression
		String s = "#%^&^&**^*^%$%#$$Manmohan1990";
		System.out.println("Before remove string is "+s);
		
		String string = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After remove string is "+string);
	}
}
