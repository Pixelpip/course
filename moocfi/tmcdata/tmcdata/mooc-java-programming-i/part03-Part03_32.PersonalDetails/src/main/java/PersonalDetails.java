
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age=0;
        String[] name;
        String[] p;
        String l="";
        int i=0;
        while(true){
            String s=scanner.nextLine();
            String n=scanner.nextLine();
            if(s.equals("")||n.equals("")){
                break;
            }
            p=s.split(",");
            name=n.split(",");
            age=age+Integer.valueOf(p[1])+Integer.valueOf(name[1]);
            if(name[0])>p[0]){
                l=name[0];
            }else{
                l=p[0];
            }
            i+=2;
        }
        System.out.println("Name of oldest is:"+l);
        System.out.println("Average of birth years:"+(age/i));

    }
}
