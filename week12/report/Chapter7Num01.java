package practice;

import java.util.*;

public class Chapter7Num01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수(-1이 입력될 때 까지)>> ");
		while(true) {
			int n = sc.nextInt();
			if(n == -1)
				break;
			v.add(n);
		}		
		int max = v.get(0);
		for (int i = 0; i < v.size(); i++) {
			if(max < v.get(i))
				max = v.get(i);
		}		
		System.out.println("가장 큰 수는 " + max);	
		sc.close();
	}
}
