import java.util.*;

public class Chapter7Num02 {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		for (int i = 0; i < 6; i++) {
			char grade = sc.next().charAt(0);
			a.add(Character.valueOf(grade));
		}
		double sum = 0.0;
		for (int i = 0; i < 6; i++) {
			if(a.get(i).equals('A'))
				sum += 4.0;
			else if(a.get(i).equals('B'))
				sum += 3.0;
			else if(a.get(i).equals('C'))
				sum += 2.0;
			else if(a.get(i).equals('D'))
				sum += 1.0;
			else if(a.get(i).equals('F'))
				sum += 0.0;
		}
		double avg = sum / 6;
		System.out.println("평균 학점: " + avg);
	}
}
