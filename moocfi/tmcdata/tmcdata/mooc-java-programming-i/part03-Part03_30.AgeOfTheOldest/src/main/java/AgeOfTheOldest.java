
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int age=0;
        int old=0;
        String[] p;
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s=scanner.nextLine();
            if(s.equals("")){
                break;
            }
            p=s.split(",");
            age=Integer.valueOf(p[1]);
            if(age>old){
                old=age;
            }
        }
        System.out.println("Age of oldest is: "+old);

    }
}
