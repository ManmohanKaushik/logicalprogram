package logicalNumber;

public class FactorialNo {
	public static void main(String[] args) {
		int a=5;
		long fact=1;
		for(int i=1;i<=a;i++) 
		{
			fact=fact*i;
		}
		System.out.println("Factorial  by 1st approach "+fact);
		
		int b=5;
		long fa=1;
		for(int i=b;i>=1;i--) 
		{
			fa=fa*i;
		}
		System.out.println("Factorial  by 2nd approach "+fa);
	}
}
