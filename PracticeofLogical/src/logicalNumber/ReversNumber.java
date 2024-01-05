package logicalNumber;

public class ReversNumber {
	public static void main(String[] args) {
        //first approach
		int a = 1234;
		int rev = 0;
		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		System.out.println(rev);

		
		// second approach by stringBuffer(thread safe)
		int b=5678;
		StringBuffer sb=new StringBuffer(String.valueOf(b));
		StringBuffer rv = sb.reverse();
		System.out.println(rv);
		
		
		// third approach by stringBulider
		int c=369;
		StringBuilder sb1=new StringBuilder();
		sb1.append(c);
		StringBuilder reve = sb1.reverse();
		System.out.println(reve);
		
	}
}
