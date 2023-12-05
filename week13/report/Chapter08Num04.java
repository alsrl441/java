package practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Chapter08Num04 {
	public static void main(String[] args) {

		try {
			int lineNumber=0;
			File f = new File("c:\\windows\\system.ini");
			Scanner scanner = new Scanner(new FileReader(f));
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				lineNumber++;
				System.out.printf("%4d : ",lineNumber);
				System.out.println(line);
			}
			scanner.close();
		}
		catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}

	}

}
