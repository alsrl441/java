import java.util.Scanner;
 
public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오>> ");
        int num = scanner.nextInt();
        
        for(int i=1;i<=num;i++) {
            for(int j=num;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
