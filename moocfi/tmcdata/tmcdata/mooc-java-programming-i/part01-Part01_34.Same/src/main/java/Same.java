
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s=scan.nextLine();
        System.out.println("Enter the second string:");
        String m=scan.nextLine();
        if(s.equals(m)){
            System.out.println("Same");

        }else{
            System.out.println("Different");
        }
    }
}
