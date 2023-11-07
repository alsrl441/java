import java.util.Scanner;
 
public class SubjectScore {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};
        
        while(true) {    
            System.out.print("과목 이름>>");
            String name = scanner.next();
            
            if(name.equals("그만"))
                break;
          
            for(int i = 0; i < course.length; i++) {
                if(course[i].equals(name)){
                    int n = score[i];
                    System.out.printf("%s의 점수는 %d\n", course[i], n);
                    break;
                }
                if(i==course.length-1)
                    System.out.println("없는 과목입니다.");
            }
        }
    }
}
