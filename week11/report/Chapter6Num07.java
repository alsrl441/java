(2)

import java.util.Scanner;

public class Chapter6Num7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");	
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");	
			System.out.println("어절 개수는 " + st.countTokens());
		}
		
		scanner.close();
	}
}

(2)

import java.util.Scanner;

public class chapter6Num7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");	
				break;
			}
			String [] words = s.split(" ");	
			System.out.println("어절 개수는 " + words.length);
		}
		
		scanner.close();
	}
}
