import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=Integer.valueOf(s.nextLine());
        int b=Integer.valueOf(s.nextLine());
        division(a, b);
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }

    // implement the method here
    public static void division(int numerator, int denominator){
        System.out.println(numerator*1.0/denominator*1.0);
    }
}
