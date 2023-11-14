package practice;

class Point{
    private int x,y;
    public Point (int x, int y) {
      this.x = x; this.y = y;
    }
    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y) {this.x = x; this.y = y;}
}
 
class ColorPoint extends Point{
    private String Color = null;
    public ColorPoint() {super(0,0); Color="BLACK";}
    public ColorPoint(int x, int y){super(x,y);}
    public void setXY(int x, int y) {move(x,y);}
    public void setColor(String Color) {this.Color = Color;}
    
    public String toString() {
        return Color + "색의 (" + getX() + "," + getY()  +")의 점";
    }
}
 
public class num_6 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");
        
        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
