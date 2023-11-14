interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다.");    draw();
    }
}
 
class Circle implements Shape {
    private int size=0;
    public Circle(int size){this.size = size;}
    @Override
    public void draw() {System.out.println("반지름이 " + size +"인 원입니다.");}
    @Override
    public double getArea() {
        double calCircle = size * size * PI;
        return calCircle;
    }
}
class Oval implements Shape{
    private int x;
    private int y;
    public Oval(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {System.out.println(x + "X" + y +"에 내접하는 타원입니다.");}
    @Override
    public double getArea() {
        double calOval = x * y * PI;
        return calOval;
    }
}
class Rect implements Shape{
    private int x;
    private int y;
    public Rect(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {System.out.println(x+ "X" + y + "크기의 사각형 입니다.");}
    @Override
    public double getArea() {
        double calRect = x * y;
        return calRect;
    }    
}
public class num_14 {
    public static void main(String[] args) {
        Shape []list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}
