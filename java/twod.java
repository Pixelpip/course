import java.util.Scanner;
public class twod {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int two[][]=new int[1][6];
        for(int i=0;i<1;i++){
            for(int j=0;j<6;j++){
                two[i][j]=Integer.valueOf(a.next());
            }
        }
        for(int i=0;i<1;i++){
            for(int j=0;j<6;j++){
                System.out.print(two[i][j]);
            }
        }
    }
}
