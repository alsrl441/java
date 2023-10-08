package practice;

import java.util.Scanner;

public class Practice2_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int i, j, k, middle;
		
		System.out.print("정수 3개 입력>>");
		i = scanner.nextInt();
		j = scanner.nextInt();
		k = scanner.nextInt();
		
		if ((i > j && i < k) || (i < j && i > k)) {
			middle = i;
		} else if ((j > i && j < k) || (j < i && j > k)) {
			middle = j;
		} else {
			middle = k;
		}
		
		System.out.println("중간 값은 " + middle);
	}
}
