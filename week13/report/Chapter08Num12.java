package practice;

import java.io.*;
import java.util.*;

public class Chapter08Num12 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		File file = new File("c:\\temp\\src\\", scanner.next());
		scanner.nextLine();
		try {
		for(;;) {
			Scanner fScanner = new Scanner(new FileInputStream(file),"MS949");
			int linenumber=1;
			System.out.print("검색할 단어나 문장>> ");
			String search = scanner.nextLine();
			if(search.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				if(line.contains(search)) {
					System.out.println(linenumber+":"+line);
				}
				linenumber++;
			}
		}
		} catch(FileNotFoundException e) {
			System.out.println("오류");
		}
	}
}
