package practice;

import java.util.Calendar;
import java.util.Scanner;

class Person {
	Calendar cal = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	private String name, buffer;
	private int sec1, sec2;
	
	public Person(String name) {
		this.name = name;
	}
	
	public int game() {
		System.out.print(name + " 시작 <Enter>키>>");
		sec1 = enter();
		System.out.print("10초 예상 후 <Enter>키>>");
		sec2 = enter();
		if(sec1 <= sec2)
			return sec2-sec1;
		else 
			return (60-sec1) + sec2;
	}
	
	public int enter() {
		buffer = sc.nextLine();
		cal = Calendar.getInstance();		
		System.out.println("    현재 초 시간 = "+ cal.get(Calendar.SECOND));
		return cal.get(Calendar.SECOND);
	}
	
	public String name() {
		return this.name;
	}
}

public class Chapter6Num6 {
	public static void main(String[] args) {
		Person p1 = new Person("황기태");
		Person p2 = new Person("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1 = p1.game();
		int result2 = p2.game();
		
		if(Math.abs(result1 - 10) == Math.abs(result2 - 10))
			System.out.println(p1.name() + "의 결과 "+result1+", " + p2.name() +"의 결과 "+result2+", 무승부");
		else if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println(p1.name() + "의 결과 "+result1+", " + p2.name() +"의 결과 "+result2+", 승자는 " + p1.name());
		else
			System.out.println(p1.name() + "의 결과 "+result1+", " + p2.name() +"의 결과 "+result2+", 승자는 " + p2.name());
	}
}
