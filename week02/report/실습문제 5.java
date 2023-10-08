package practice;

import java.util.Scanner;

public class Practice2_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int i, j, k;
		
		System.out.print("정수 3개를 입력하시오>>");
		i = scanner.nextInt();
		j = scanner.nextInt();
		k = scanner.nextInt();
		
		if (i + j > k && i + k > j && k + j > i) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 안 됩니다.");
		}
	}
}
