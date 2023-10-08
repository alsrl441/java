package practice;

import java.util.Scanner;

public class Practice2_12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double i, j;
		String operator;
		
		System.out.print("연산>>");
		i = scanner.nextDouble();
		operator = scanner.next();
		j = scanner.nextDouble();
		
		
		if (operator == "/" && j == 0 || j == 0.0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			switch (operator) {
			case "+":
				System.out.println(i + " + " + j + " = " + (i + j));
				break;
			case "-":
				System.out.println(i + " - " + j + " = " + (i - j));
				break;
			case "*":
				System.out.println(i + " * " + j + " = " + (i * j));
				break;
			case "/":
				System.out.println(i + " / " + j + " = " + (i / j));
				break;
			default:
				System.out.println("+, -, *, / 4개의 연산자만 사용할 수 있습니다.");
			
			}
		}
		
		scanner.close();
	}
}
