import java.util.Scanner;
public class twod {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int two[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                two[i][j]=Integer.valueOf(a.next());
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(two[i][j]);
            }
        }
    }
}
