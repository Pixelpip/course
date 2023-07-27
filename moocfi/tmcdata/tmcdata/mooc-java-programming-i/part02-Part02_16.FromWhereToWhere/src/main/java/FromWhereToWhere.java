
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int a=Integer.valueOf(scanner.nextLine());
        //for(int i=1;i<=a;i++){
           //System.out.println(i);
        //}
        System.out.println("Where from?");
        int b=Integer.valueOf(scanner.nextLine());
        if(b>a)
        {
            System.out.println("");
        }
        else
        {
           for(int i=b;i<=a;i++)
           {
            System.out.println(i);
           }
        }
    }
}
