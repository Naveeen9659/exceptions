package exception;

import java.io.*;

public class CompileTime {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("C:\\Users\\nkris\\OneDrive\\Desktop\\Tst.txt");
		try {
			FileReader fr = new FileReader(f);
			int temp = 0;
			while ((temp = fr.read()) != -1) {
				System.out.print((char) (temp));
			}
		} catch (FileNotFoundException x) {
			System.out.println("File not Found");
		}
		System.out.println("Thank You");

	}
}
