public class AverageOfArray {
    public static void main(String[] args) {
        int sum=0;
        System.out.print("랜덤한 정수들 : ");
        
        for(int j=0;j<10;j++) {
            int i = (int)(Math.random()*10+1);
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.print("평균은 :" + sum/10.);
    }
}
