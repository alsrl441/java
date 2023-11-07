public class Average {
 
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        
        for(int i=0;i<args.length;i++) {
            count++;
            sum+= Integer.parseInt(args[i]);
        }
        
        System.out.print(sum/count);
    }
}
