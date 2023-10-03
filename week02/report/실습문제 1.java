package practice;

import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {
		int won;
		double dollar;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		won = scanner.nextInt();
		dollar = won / 1100.0;
		
		System.out.println(won + "원은 $" + dollar + "입니다.");
	}

}
