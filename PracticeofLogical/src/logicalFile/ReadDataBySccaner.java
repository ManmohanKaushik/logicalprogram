package logicalFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataBySccaner {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\EclipsWorkSpace\\logicFilewriter.txt");
		Scanner sc = new Scanner(fr);
		
		/*while(sc.hasNext()) 
		{
			System.out.println(sc.nextLine());
		}*/
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());

	}
}
