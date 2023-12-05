package practice;

import java.io.*;
import java.util.*;

public class Chapter08Num10 {
	String fileName = "c:\\temp\\phone.txt";
	HashMap<String, String> phoneMap = new HashMap<String, String>();

	public static void main(String[] args) {
		Ex_08_10 phone = new Ex_08_10();
		phone.run();
	}

	public void run() {
		readPhoneFile();
		findPhone();
	}

	public void readPhoneFile() {
		try {
			Scanner fscanner = new Scanner(new FileReader(new File(fileName)));
			while (fscanner.hasNext()) {
				String name = fscanner.next();
				String tel = fscanner.next();
				phoneMap.put(name, tel);
			}
			fscanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");
	}

	public void findPhone() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("이름>> ");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			String tel = phoneMap.get(name);
			if (tel == null)
				System.out.println("찾는 이름이 없습니다.");
			else
				System.out.println(tel);
		}
	}

}
