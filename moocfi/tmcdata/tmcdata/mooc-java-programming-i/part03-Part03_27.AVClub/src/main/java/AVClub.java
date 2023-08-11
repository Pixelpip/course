
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] p=s.split(" ");
        for(int i=0;i<p.length;i++){
            for(int j=0;j<=p.length;j++){
                if(p[j].contains("av")){
                    System.out.println(p[j]);
                }
                s=scanner.nextLine();
                p=s.split(" ");
            }
        }

    }
}
