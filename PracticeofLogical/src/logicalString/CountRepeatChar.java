package logicalString;

public class CountRepeatChar {
public static void main(String[] args) {
	String s="Manmohankaushik";
	int totalLength = s.length();
	int lengthWithoutA = s.replaceAll("a", "").length();
	int withA=totalLength-lengthWithoutA;
	System.out.println("No of occurence of a is "+withA);
}
}
