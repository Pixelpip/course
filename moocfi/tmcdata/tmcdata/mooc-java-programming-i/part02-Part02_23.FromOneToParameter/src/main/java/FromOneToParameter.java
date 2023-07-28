import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=Integer.valueOf(s.nextLine());
        printUntilNumber(a);

    }
    public static void printUntilNumber(int number){
        int i=1;
        while(i<=number){
            System.out.println(i);
            i++;
        }
    }

}
