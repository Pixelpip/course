
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int a=Integer.valueOf(scanner.nextLine());
        int r=0;
        for(int i=1;i<=a;i++){
            r=r+i;
            
        }
        System.out.println("The sum is "+r);

    }
}
