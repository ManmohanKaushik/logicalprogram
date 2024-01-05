package logicalArray;

public class MaxAndMini {
	public static void main(String[] args) {

		int a[] = { 45, 85, 20, 66, 78 };
		int max = a[0];
		int b[] = { 45, 85, 20, 66, 78 };
		int min = b[0];
 
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max)
			{
			max=a[i];	
			}
		}
		System.out.println("The maximum value in array a is = "+max);
		
		
		for(int i=1;i<b.length;i++) {
			if(b[i]<min) 
			{
			min=b[i];	
			}
			
		}
		System.out.println("The minimum value in array b is = "+min
				);
	}
}
