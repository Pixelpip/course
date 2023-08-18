public class numpat {
    public static void main(String[] args){
        int t[][]=new int[4][];
        t[0]=new int[1];
        t[1]=new int[2];
        t[2]=new int[3];
        t[3]=new int[4];
        int k=0;
        for(int i=0;i<4;i++){  //less than 4 to prevent going out of bound 
            for(int j=0;j<=i;j++){   //j<=i to prevent outofbounds error  
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
