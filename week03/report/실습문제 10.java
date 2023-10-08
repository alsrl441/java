package practice;

import java.util.Scanner;

public class Practice2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int x1, y1, radius1, x2, y2, radius2;
		
		System.out.print("첫번째 원의 중심 좌표와 반지름 입력>>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		radius1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심 좌표와 반지름 입력>>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		radius2 = scanner.nextInt();
		
		if (((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)) <= radius1 + radius2) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		
		
		scanner.close();
		
	}
}
