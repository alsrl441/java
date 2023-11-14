
import java.util.Scanner;
 
interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}
 
class StringStack implements Stack{
    
    private String Stack[];
    private int top =0;
    
    public StringStack(int number) {Stack = new String[number];}
    // 현재 스택에 저장된 개수 리턴
    public int length() {return top;}
    // 전체 저장 가능한 개수 리턴
    public int capacity() {return Stack.length;}
    
    // 스택의 톱(top)에 실수 저장
    public String pop() {
        if(top==0) {
            return "빈 상태";
        }
        else {
            String stay = Stack[top-1];
            top--;
            return stay;
        }
    }
    // 스택의 톱(top)에 저장된 실수 리턴
    public boolean push(String val) {
        if (top==Stack.length) {
            return false;
        }
        else{
            Stack[top] =val;
            top++;
            return true;
        }
    }
 
}
 
public class num_9 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int number = sc.nextInt();
        StringStack ss = new StringStack(number);
        
        while(true) {
            System.out.print("문자열 입력 >> ");
            String text = sc.next();
            
            if(text.equals("그만")) {break;}
            
            boolean isCheck = ss.push(text);
            
            if(isCheck ==false) {System.out.println("스택이 꽉 차서 푸시 불가!");}
        }
        int textPop = ss.length();
        for(int i=0;i<textPop;i++) {
            System.out.print(ss.pop() +" ");
        }
    }
    public static void main(String[] args) {
        num_9 n = new num_9();
        n.run();
    }
}
