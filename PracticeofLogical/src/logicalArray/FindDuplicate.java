package logicalArray;

public class FindDuplicate {
	public static void main(String[] args) {
		String str[] = { "ram", "sham", "shiv", "uma", "ram" };
		boolean check = false;
		for (int i = 0; i < str.length; i++) 
		{
			for (int j = i + 1; j < str.length; j++)
			{
				if (str[i] == str[j]) 
				{
					System.out.println("The dulplicate value is " + str[i]);
					check=true;
				}
			}
		}
		if(check==false) 
		{
			System.out.println("No dulplicate is found");
		}
	}
}