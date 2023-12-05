package practice;

import java.io.*;
import java.util.*;

public class Chapter08Num11 {
	public static void main(String [] args) {
		File words = new File("c:\\temp\\words.txt");
		Vector<String> v = new Vector<String>();
		try {
		Scanner fScanner = new Scanner(new FileReader(words));
		Scanner scanner = new Scanner(System.in);
		while(fScanner.hasNext()) { 
			String line = fScanner.nextLine();
			v.add(line);
		} 
		System.out.println("프로젝트 폴더 밑의 "+words.getName()+" 파일을 읽었습니다...");
		for(;;) {
			System.out.print("단어>>");
			String search = scanner.next();
			int size = search.length();
			if(search.equals("그만")) {
				System.out.println("종료합니다...");
				return;
			}
			else {
				int n=0;
				for(int i=0;i<v.size();i++) {
					if(v.get(i).startsWith(search)) {
						n++;
						System.out.println(v.get(i));
					}
				}
				if(n==0)
					System.out.println("발견할 수 없음");
		}
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("오류");
		}
	}
}
