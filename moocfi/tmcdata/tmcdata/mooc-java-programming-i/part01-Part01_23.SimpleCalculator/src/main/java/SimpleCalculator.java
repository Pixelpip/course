
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int a=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int b=Integer.valueOf(scanner.nextLine());
        
        double d=a/(b*1.0);
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+d);

    }
}
