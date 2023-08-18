import java.util.Scanner;
public class twod {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int two[][]=new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                two[i][j]=Integer.valueOf(a.nextLine());
            }
        }
    }
}
