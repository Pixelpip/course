
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] p=s.split(" ");
        for(int i=0;i<p.length;i++){
            if(p[i].equals("av")){
                System.out.println(p[i]);
            }
        }

    }
}
