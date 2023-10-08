package practice;

import java.util.Scanner;

public class Practice2_2 {
	public static void main(String[] args) {
		int i;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("2자리 정수 입력(10~99>>");
		i = scanner.nextInt();
		
		if (i >= 10 && i <= 99) {
			if (i / 10 == i % 10) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			} else {
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
			}
		} else {
			System.out.println("10 ~ 99 사이의 정수를 입력해주세요.");
		}
		
		
	}

}
