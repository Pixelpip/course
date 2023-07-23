
import java.util.Scanner;

public class NumberAndSumOfNumbers{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int n=0;
        while(true){
            System.out.println("Give a number:");
            int a=Integer.valueOf(scanner.nextLine());
            if(a!=0){
                i=i+a;
                n++;
            }else {
                break;
            }
        }
        System.out.println("Number of numbers: "+n);
        System.out.println("Sum of the numbers: "+i);

    }
}
