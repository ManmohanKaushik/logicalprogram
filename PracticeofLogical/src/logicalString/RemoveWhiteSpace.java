package logicalString;

public class RemoveWhiteSpace {
public static void main(String[] args) {
	// By regular expression
	
	String s ="Manmohan    kaushik   Sandwa";
	System.out.println("Before remove white space "+s);
	String string = s.replaceAll("\\s", "");
	System.out.println("After remove white space "+string);
	
}
}
