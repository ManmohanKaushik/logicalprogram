package logicalNumber;

public class PaledormNumber {
	public static void main(String[] args) {
		int a=16561;
		int t=a;
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(t==rev) {
			System.out.println("The Number is paledorm");
		}else {
			System.out.println("The Number is not paledorm");
	}
	}}


