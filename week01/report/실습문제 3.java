package practice;

import java.util.Scanner;

public class Practice2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int money = 0;
				
		System.out.print("금액을 입력하시오>>");
		money = scanner.nextInt();
		
		if ((money / 50000) >= 1) {
			System.out.println("오만원권" + (money / 50000) + "매");
			money -= 50000 * (money / 50000);
		} if ((money / 10000 >= 1)) {
			System.out.println("만원권" + (money / 10000) + "매");
			money -= 10000 * (money / 10000);
		} if ((money / 5000) >= 1) {
			System.out.println("오천원권" + (money / 5000) + "매");
			money -= 5000 * (money / 5000);
		} if ((money / 1000 >= 1)) {
			System.out.println("천원권" + (money / 1000) + "매");
			money -= 1000 * (money / 1000);
		} if ((money / 500) >= 1) {
			System.out.println("오백원" + (money / 500) + "개");
			money -= 500 * (money / 500);
		} if ((money / 100 >= 1)) {
			System.out.println("백원" + (money / 100) + "개");
			money -= 100 * (money / 100);
		} if ((money / 50) >= 1) {
			System.out.println("오십원" + (money / 50) + "개");
			money -= 50 * (money / 50);
		} if ((money / 10 >= 1)) {
			System.out.println("십원" + (money / 10) + "개");
			money -= 10 * (money / 10);
		} if ((money / 5) >= 1) {
			System.out.println("오원" + (money / 5) + "개");
			money -= 5 * (money / 5);
		} if ((money >= 1)) {
			System.out.println("일원" + money + "개");
			money -= money;
		}
		
		scanner.close();
	}
	
}
