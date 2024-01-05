package logicalArray;

public class EvenOddinArray {
	public static void main(String[] args) {
		int a[] = { 5, 4, 6, 10, 12, 45, 85, 33, 98, 79 };
		System.out.println("Even number present in array 'a' are ");
		for (int v : a) 
		{
			if (v % 2 == 0) {
				System.out.println(v);
			}
		}
		System.out.println("Odd number present in array 'a' are ");
		for (int v : a) 
		{
			if (v % 2 != 0) {
				System.out.println(v);
			}
		}
		// 2nd approach
		
		int b[] = { 9,10,11,12,22,23,45,66 };
		System.out.println("Even number present in array 'b' are ");
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]%2==0) {
				System.out.println(b[i]);
			}
			
		}
		System.out.println("Odd number present in array 'b' are ");
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]%2!=0) {
				System.out.println(b[i]);
			}
			
		}
	}
}
