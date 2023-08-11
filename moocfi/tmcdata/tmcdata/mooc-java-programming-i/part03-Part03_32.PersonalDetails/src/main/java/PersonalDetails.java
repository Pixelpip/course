
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String s=scanner.nextLine();
            if(s.equals("")){
                return;
            }
            String[] n=s.split(",");
            String o=n[0];
            double age=Integer.valueOf(n[1]);
            int i=1;
        while(true){
            String p=scanner.nextLine();
            n=p.split(",");
            if(p.equals("")){
                break;
            }
            if(n.length>o.length()){
                o=n[0];
            }
            age=age+Integer.valueOf(n[1]);
            i++;
        }
        System.out.println("Longest name:"+o);
        System.out.println("Average of birth years:"+(age/i));
    }
}
