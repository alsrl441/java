package practice;

import java.util.Scanner;

public class Practice2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int x1, y1, radius, x2, y2;
		
		System.out.print("원의 중심 좌표와 반지름 입력>>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		radius = scanner.nextInt();
		
		System.out.print("점 좌표 입력>>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		if (((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)) <= radius * radius) {
			System.out.println("점 (" + x2 + ", " + y2 + ")는 원 안에 있다.");
		}
		
		
		scanner.close();
	}
}
