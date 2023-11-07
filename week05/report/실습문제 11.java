
import java.util.Scanner;
 
class Add {
    private int a=0;
    private int b=0;    
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a+b;
    }
}
 
class Sub {
    private int a=0;
    private int b=0;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a-b;
    }
}
 
class Mul {
    private int a=0;
    private int b=0;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a*b;
    }
}
 
class Div {
    private int a=0;
    private int b=0;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a/b;
    }
}    
 
public class Calculate {
    Scanner scanner = new Scanner(System.in);
    Add add = new Add();
    Sub sub = new Sub();
    Mul mul = new Mul();
    Div div = new Div();
    
    public Calculate(){
        System.out.print("두 정수와 연산자를 입력하시오>>");
    }
    
    public void run() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String text = scanner.next();
        int set=0;
        
        switch(text){
        case "+":
            add.setValue(a,b);
            set = add.calculate();
            break;
        case "-":
            sub.setValue(a,b);
            set = sub.calculate();
            break;
        case "*":
            mul.setValue(a,b);
            set = mul.calculate();
            break;
        case "/":
            div.setValue(a,b);
            set = div.calculate();
            break;
        default:
            break;
        }
        System.out.print(set);
    }
    
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.run();
    }
}
