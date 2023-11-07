public class Random2Array2 {
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        int randomNumber=0;
        
        while(randomNumber<10) {
            int x = (int)(Math.random()*4);
            int y = (int)(Math.random()*4);
            
            if(array[x][y]==0) {
                array[x][y] = (int)(Math.random()*10+1);
                randomNumber +=1;
            }
        }
        
        for(int i=0;i<array.length;i++){
            for(int j=0; j<array.length;j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
 
}
