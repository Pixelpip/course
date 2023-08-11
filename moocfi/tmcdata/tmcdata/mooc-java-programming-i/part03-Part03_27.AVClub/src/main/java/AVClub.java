
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] p=s.split(" ");
        for(int i=-1;i<=p.length;i++){
            for(int j=-1;j<=p.length;j++){
                if(p[j+1].contains("av")){
                    System.out.println(p[j+1]);
                }
                s=scanner.nextLine();
                p=s.split(" ");
                i=-1;
            }
        }

    }
}
