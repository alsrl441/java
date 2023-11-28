package practice;

import java.util.*;

public class Chapter7Num03 {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라의 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구>> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			int population = sc.nextInt();
			
			nations.put(name, population);
		}
		
		while(true) {
			System.out.print("인구 검색>>");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			if(nations.get(name) == null)
				System.out.println(name + "나라는 없습니다.");
			else
				System.out.println(name + "의 인구는 " + nations.get(name));
		}
		sc.close();
  }
}
