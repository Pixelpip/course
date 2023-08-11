
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s=scanner.nextLine();
            if(s.equals("")){
                break;
            }
            String[] p=s.split(" ");
            System.out.println(p[p.length-1]);
        }


    }
}
