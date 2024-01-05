package logicalArray;

import java.util.HashSet;

public class FindDuplicateByHashset {
	public static void main(String[] args) {

		String str[] = { "ram", "sham", "shiv", "uma", "ram" };
		HashSet<String> set=new HashSet<String>();
		boolean b=false;
		for(String s:str)
		{
			if(set.add(s)==false)
			{
				System.out.println("The duplicate value is "+s);
				b=false;
			}
		}
		if(b==false)
		{
			System.out.println("No duplicate is found");
			
		}
	}
}
