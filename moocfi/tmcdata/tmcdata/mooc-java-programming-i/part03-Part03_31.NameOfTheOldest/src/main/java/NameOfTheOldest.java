
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=0;
        int old=0;
        String name="";
        String[] p;
        while(true){
            String s=scanner.nextLine();
            if(s.equals("")){
                break;
            }
            p=s.split(",");
            age=Integer.valueOf(p[1]);
            if(age>old){
                old=age;
                name=p[0];
            }
        }
        System.out.println("Name of oldest is:"+name);


    }
}
