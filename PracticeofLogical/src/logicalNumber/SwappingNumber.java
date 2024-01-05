package logicalNumber;

public class SwappingNumber {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 85;
		System.out.println("Original values  b= " + b + " a= " + a);
		int t = a;
		a = b;
		b = t;
		System.out.println("Logic 1st   b= " + b + " a= " + a);
		int a1 = 23;
		int b1 = 85;
		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;

		System.out.println("Logic 2nd   b= " + b1 + " a= " + a1);
		int x = 10;
		int y = 20;

		System.out.println("Original values  x= " + x + " y= " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("Logic 3rd   x= " + x + " y= " + y);
		int x1 = 10;
		int y1 = 20;
		x1 = x1 ^ y1;
		y1 = x1 ^ y1;
		x1 = x1 ^ y1;
		System.out.println("Logic 4th   x= " + x1 + " y= " + y1);
		int c = 12;
		int d = 56;
		System.out.println("c= " + c + "  d= " + d);
		d=c+d-(c=d);
		System.out.println("In single line logic c= "+c+" d= "+d);
	}
}
