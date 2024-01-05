package logicalString;

public class PaledormString {
	public static void main(String[] args) {
		String str = "mom";
		String orgStr=str;
		String rev="";
		 int len=str.length();
		 for(int i=len-1;i>=0;i--) {
			 rev=rev+str.charAt(i);
		 }
		if(orgStr.equals(rev)) {
			 System.out.println("The string is paladrom");
		}else {
			System.out.println("The string is not paladarom");
		}
	}
}
