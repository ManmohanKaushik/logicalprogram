package logicalFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTextfile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\EclipsWorkSpace\\logicFilewriter.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("java ");
			bw.write("\nJava8 ");
			bw.write("\nSpring Boot ");
			bw.write("\nRealtime tools ");
			bw.write("\nMohali phone no 7620352553 ");
			System.out.println("Finished..................");

			bw.close();

		}

		catch (IOException e) {

			e.printStackTrace();
		}
	}
}
