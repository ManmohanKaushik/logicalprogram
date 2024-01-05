package logicalNumber;

public class CheckPrimeNo {
	public static void main(String[] args) {
		int a = 3;
		int cout = 0;
		
		if (a > 1)
		{
			for (int i = 1; i <= a; i++) 
			{
				if (a % i == 0) 
				{
					cout++;
				}
			}
			if (cout == 2) 
			{
				System.out.println("Prime Number");
			} 
			else 
			{
				System.out.println("Not Prime number");
			}
		}

		else 
		{
			System.out.println("Not Prime Number");
		}
	}
}
