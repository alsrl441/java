import java.util.Scanner;
 
public class RockScissorsPaper {Random integer array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
 
        while (true){
            System.out.print("가위 바위 보!>>");
            String text = scanner.nextLine();
            
            int n = (int)(Math.random()*3);
            
            if(text.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
                }
            else if(str[n].equals("가위"))
                if(text.equals("가위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", text, str[n]);
                else if(text.equals("바위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 이겼습니다.\n", text, str[n]);
                else
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 졌습니다.\n", text, str[n]);
            else if(str[n].equals("바위"))
                if(text.equals("바위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", text, str[n]);
                else if(text.equals("보"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 이겼습니다.\n", text, str[n]);
                else
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 졌습니다.\n", text, str[n]);
            else
                if(text.equals("보"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", text, str[n]);
                else if(text.equals("가위"))
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 이겼습니다.\n", text, str[n]);
                else
                    System.out.printf("사용자 = %s , 컴퓨터 = %s, 졌습니다.\n", text, str[n]);
        }        
    }
}
