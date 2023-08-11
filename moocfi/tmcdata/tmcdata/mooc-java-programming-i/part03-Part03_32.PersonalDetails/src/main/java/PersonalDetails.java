
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l="";
        int z=0;
        double birth=0;
        while(true){
            String s=scanner.nextLine();
            if(s.equals("")){
                break;
            }
            String[] p=s.split(",");
            if(p[0].length()>l.length()){
                l=p[0];
            }
            birth=birth+Integer.valueOf(p[1]);
            z++;
        }
        System.out.println("Longest name:"+l);
        System.out.println("Average of birth years:"+(birth/z));
    }
}
