public class numpat {
    public static void main(String[] args){
        int t[][]=new int[4][];
        t[0]=new int[1];
        t[1]=new int[2];
        t[2]=new int[3];
        t[3]=new int[4];
        int k=0;
        for(int i=0;i<4;i++){  //The outer loop for(int i=0;i<4;i++) runs for i values from 0 to 3 (a total of 4 iterations). This controls the rows of the two-dimensional array t[][]
            for(int j=0;j<=i;j++){   //The inner loop for(int j=0;j<=i;j++) runs for j values from 0 to the current value of i
                t[i][j]=k;
                k++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
    }
}
