import java.util.Scanner;
 
class Day{
    private String work = null;
    
    public String get() {return work;}
    public void set(String work){this.work = work;}
    
    public void show() {
        if(work == null)
            System.out.println("없습니다.");
        else
            System.out.println("있습니다.");
    }
}
 
public class MonthSchedule {
    Scanner scanner = new Scanner(System.in);
    Day day[] = null;
    boolean isDay = true;
    int dayNum = 0;
    
    public MonthSchedule (int days) {
        dayNum = days;
        day = new Day[dayNum];
        
        for(int i=0; i<day.length;i++) {
            day[i] = new Day();
        }
    }
    
    public void input() {
        System.out.print("날짜(1~30)?");
        int days = sc.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        String work = sc.next();
        day[days-1].set(work);
        
    }
    
    public void view() {
        System.out.print("날짜(1~30)");
        int days = sc.nextInt();
        System.out.println(days+"일의 할 일은 " + day[days-1].get() + "입니다.");
    }
    
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
        isDay = false;
    }
    
    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(isDay) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:
                input();
                break;
            case 2:
                view();
                break;
            case 3:
                finish();
                break;
            default:
                System.out.println("1~3 값을 입력해주세요");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {    
        num_7 april = new num_7(30);
        april.run();
    }
}

