package practice;

import java.util.Scanner;

public class Practice2_11_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int month;
		
		System.out.print("달을 입력하세요(1~12)>>");
		month = scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("봄");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("봄");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력.");
		}
	}
}
