package practice;

import java.util.Scanner;

public class Practice2_11_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int month;
		
		System.out.print("달을 입력하세요(1~12)>>");
		month = scanner.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month == 12 || month >= 1 && month <= 2){
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력.");
		}

	}
}
