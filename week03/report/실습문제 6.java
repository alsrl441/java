package practice;

import java.util.Scanner;

public class Practice2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int i;
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		i = scanner.nextInt();
		
		if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9 && i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
			System.out.println("박수짝짝");
		} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
			System.out.println("박수짝");
		}
		
		scanner.close();
	}
}
