package logicalArray;

public class SumArray {
	public static void main(String[] args) {
		// 1st approach
		int a[] = { 5, 4, 6, 10 };
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of array 'a' is = "+sum);
		// 2nd approach
		int b[]= {4,5,6,10,20};
		int sum1=0;
		for(int v:b) {
			sum1=sum1+v;
		}
		System.out.println("Sum of array 'b' is = "+sum1);
	}
}
