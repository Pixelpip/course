import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while(true){
            System.out.println("Give a number:");
            int a=Integer.valueOf(scanner.nextLine());
            if(a==0){
                break;
            }
            i=i+1;
        }System.out.println("Number of numbers: "+i);

    }
}
