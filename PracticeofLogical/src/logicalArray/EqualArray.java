package logicalArray;

import java.util.Arrays;

public class EqualArray {
	public static void main(String[] args) {
		int a[] = { 9,10,11,12,22,23,45,66 };
		int b[] = { 9,10,11,12,22,23,45,66 };
		boolean equals = Arrays.equals(a, b);
		System.out.println("Both Arrays are equals "+equals);
		
		//2nd approach
		int a1[] = {45,89, 9,10,11,12,22,23 };
		int a2[] = {45,89, 9,10,11,16,22,23 };
		 boolean status=true;
		 if(a1.length==a2.length)
		 {
			for(int i=0;i<a1.length;i++) 
			{
				if(a1[i]!=a2[i]) 
				{
					status=false;
				}
			} 
		 }
		 else {
			 status=false;
		 }
		 if(status==true)
		 {
			 System.out.println("Both Arrays are equals ");
		 }else
		 {
			 System.out.println("Both Arrays are not equals ");
		 }
		
	}
}
