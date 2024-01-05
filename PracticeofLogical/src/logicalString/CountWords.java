package logicalString;

public class CountWords {
public static void main(String[] args) {
	String s="Manmohan Kaushik Sandwa";
	int cout=1;
	for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i))==' ' && (s.charAt(i+1)!=' ')) {
			cout++;
		}
	}
	System.out.println("Number of words in a String is  "+cout);
}
}
