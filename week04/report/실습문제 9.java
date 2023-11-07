public class Random2Array {
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                int r = (int)(Math.random()*10+1);
                array[i][j]=r;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
 
