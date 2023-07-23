
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        double n=0;
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
        System.out.println("Average of the numbers: "+(i/n));
        

    }
}
