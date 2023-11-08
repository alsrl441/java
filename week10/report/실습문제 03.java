package practice;

import java.util.Scanner;

abstract class Converter{
    abstract protected String a();			// 변환 대상
    abstract protected String b();			// 변환 결과
    protected double ratio;				// 변환 비율
    abstract protected double convert(double src);	// 받은 값 변환
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(a() + "을 " + b() + "로 바꿉니다.");
        System.out.print(a() + "을 입력하세요>> ");
        double a = scanner.nextDouble();
        double b = convert(a);
        System.out.println("변환 결과: " + b + b() + "입니다.");
        scanner.close();
    }
}

class Won2Dollar extends Converter{
    public Won2Dollar(double ratio){
    	this.ratio = ratio;
    }
    protected double convert(double src) {
    	return src/ratio;
    }
    protected String a() {
    	return "원";
    }
    protected String b() {
    	return "달러";
    }
    
}

public class Won2DollarEx {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
