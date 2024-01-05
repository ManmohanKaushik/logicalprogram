package logicalString;

public class SwappingString {
	public static void main(String[] args) {
		String s = "Shiva";
		String r = "Ram";
		System.out.println("Before swap s = "+s + "  & r = " + r);
		s = s + r;
		r = s.substring(0, s.length() - r.length());
		s = s.substring(r.length());
		System.out.println("After swap s = " + s + "  & r = " + r);

	}
}
