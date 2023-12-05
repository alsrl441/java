
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Chapter08Num01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		File f = new File("c:\\Temp\\phone.txt");
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			fout = new FileWriter(f);
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = scanner.nextLine();
				if (line.equals("그만"))
					break;
				fout.write(line + "\r\n");
			}
			System.out.println(f.getPath() + "에 저장하였습니다");
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}

	}

}
